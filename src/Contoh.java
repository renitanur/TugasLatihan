import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

    public class Contoh {
        public static void main(String[] args) {
            try {
                // Mengirim permintaan HTTP ke server dan mendapatkan responsenya
                URL url = new URL("https://dummyjson.com/products/search?q=Laptop");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                // Memeriksa status responsenya
                if (connection.getResponseCode() != 200) {
                    System.out.println("Gagal memuat data dari server: " + connection.getResponseMessage());
                    return;
                }

                // Membaca responsenya
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Mengubah responsenya menjadi JSON Array
                JSONArray jsonArray = new JSONArray(response.toString());

                // Menampilkan data sebelum diurutkan
                System.out.println("Data Laptop sebelum diurutkan:");
                displayData(jsonArray);

                // Mengurutkan data berdasarkan rating menggunakan Selection Sort
                selectionSort(jsonArray);

                // Menampilkan data setelah diurutkan
                System.out.println("Data Laptop setelah diurutkan:");
                displayData(jsonArray);

                // Menerima input dari pengguna untuk pencarian berdasarkan rating
                BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Masukkan nilai rating yang ingin dicari: ");
                String targetRating = userInputReader.readLine();

                // Mencari data berdasarkan rating
                JSONArray searchResults = searchByRating(jsonArray, targetRating);

                // Menampilkan hasil pencarian
                System.out.println("Hasil pencarian dengan rating " + targetRating + ":");
                if (searchResults.length() > 0) {
                    displayData(searchResults);
                } else {
                    System.out.println("Tidak ditemukan data dengan rating " + targetRating);
                }

                // Menutup koneksi
                connection.disconnect();

            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat menghubungi server: " + e.getMessage());
            }
        }

        // Metode untuk menampilkan data dari JSONArray
        private static void displayData(JSONArray jsonArray) {
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                System.out.println("Nama: " + obj.getString("name"));
                System.out.println("Harga: " + obj.getString("price"));
                System.out.println("Rating: " + obj.getString("rating"));
                System.out.println("---------------------------");
            }
        }

        // Metode untuk mengurutkan JSONArray berdasarkan rating menggunakan Selection Sort
        private static void selectionSort(JSONArray jsonArray) {
            for (int i = 0; i < jsonArray.length() - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < jsonArray.length(); j++) {
                    JSONObject obj1 = jsonArray.getJSONObject(j);
                    JSONObject obj2 = jsonArray.getJSONObject(minIndex);
                    if (obj1.getDouble("rating") < obj2.getDouble("rating")) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    JSONObject temp = jsonArray.getJSONObject(i);
                    jsonArray.put(i, jsonArray.getJSONObject(minIndex));
                    jsonArray.put(minIndex, temp);
                }
            }
        }

        // Metode untuk mencari data berdasarkan rating
        private static JSONArray searchByRating(JSONArray jsonArray, String targetRating) {
            JSONArray searchResults = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                if (obj.getString("rating").equals(targetRating)) {
                    searchResults.put(obj);
                }
            }
            return searchResults;
        }

        public static JSONArray searchByRating(JSON.JSONArray jsonArray, String targetRating) {
        }
    }



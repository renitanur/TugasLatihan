import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class UAS_no3{
    private static int j;
    private static boolean minIndex;
    private static boolean i;

    public static void main(String[] args) {
        try {
            //Mengirim permintaan HTTP ke server dan mendapatkan responsenya
            URL url = new URL("https://dummyjson.com/products/search?q=Laptop");
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() != 200) {
                System.out.println("Gagal memuat data dari server: " + connection.getResponseMessage());
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String Line;
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSON.JSONArray jsonArray = new JSON.JSONArray(response.toString());
            System.out.println("Data Laptop sebelum diurutkan:");
            displayData(jsonArray);

            //menampilakn data setelah diurutkan
            System.out.println("Data Laptop setelah diurutkan:");
            displayData(jsonArray);

            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukkan nilai rating yang ingin dicari:");
            String targetRating = userInputReader.readLine();

            JSONArray searchResults = Contoh.searchByRating(jsonArray, targetRating);
            System.out.println("Hasil pencarian dengan rating" + "targetRating");
            if (searchResults.length() > 0) {
                displayData(searchResults);
            } else {
                System.out.println("Tidak ditemukan data dengan rating" + targetRating);
                connection.disconnect();

            }
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan saat menghubungi server:" + e.getMessage());
        }

        }

    private static void displayData(JSONArray jsonArray) {
        for (int i = 0; i <jsonArray.length(); i ++){
            JSONObject object = jsonArray.getJSONObject(i);
            System.out.println("Nama:" + object.getString("Name"));
            System.out.println("Harga:" + object.getString("Price"));
            System.out.println("Rating:" + object.getString("Rating"));
            System.out.println("----------------------------------------");
        }
    }
    private static void selectionSort(JSONArray jsonArray){
        for (int i = 0; i <jsonArray.length()-1;i ++){
            int minIndex = i;
            for (int j = i+1;j<jsonArray.length(); j ++);
            JSONObject object1 = jsonArray.getJSONObject(i);
            JSONObject object2 = jsonArray.getJSONObject(minIndex);
            if (object1.getDouble("Rating")<object2.getDouble("Rating")){
                minIndex = j;
            }

        }
    }

    private static void displayData(JSON.JSONArray jsonArray) {
    }

    private static void While(boolean b) {
    }
}
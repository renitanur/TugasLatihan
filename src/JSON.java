import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JSON {
    private final String USER_AGENT = "Mozilla/5.0";

    public static URL buidURL(String urlQuery) {
        URL url = null;
        try {
            url = new URL(urlQuery.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public GlossEntry fromJson(JSON json, Class<GlossEntry> glossEntryClass) {
    }


    protected static class JSONArray {
        public JSONArray(String response) {
        }

        public int length() {
            return length();
        }

        public JSONObject getJSONObject(int i) {
            return null;
        }
    }

    public static class JSONObject {
        public static org.json.JSONObject myJObject;
    }
    public String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();
            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("//A");
            boolean hasilInput = scanner.hasNext();
            if (hasilInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }

    public static int jumlahpasien;

    public static void main(String[] args) throws IOException {
        ConnectUri koneksiaku = new ConnectUri();
        URL myAddres = koneksiaku.buidURL("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM ");
        String response = koneksiaku.getResponseFromHttpUrl(myAddres);
        System.out.println(response);

        assert response != null;
        JSONArray responseJSON = new JSONArray(response);
        ArrayList<Pasien> Pasien = new ArrayList<>();
        for (int i = 0; i < responseJSON.length(); i++) {
            Pasien resPasien = new Pasien();
            JSONObject myJSONObject = responseJSON.getJSONObject(i);
        }
        System.out.println("Response");
        for (int index = 0; index < Pasien.size(); index++) {
            int jumlahpasien = Integer.parseInt(Pasien.get(index).getNIK());
            {
                jumlahpasien++;
                System.out.println("NIK  : " + Pasien.get(index).getNIK());
                System.out.println("NAMA : " + Pasien.get(index).getNAMA());
                System.out.println("ALAMAT  : " + Pasien.get(index).getALAMAT());
                System.out.println("TGLLAHIR : " + Pasien.get(index).getTGLLAHIR());
                System.out.println("JENISKELAMIN  : " + Pasien.get(index).getJENISKELAMIN());
                System.out.println("GOLDA : " + Pasien.get(index).getGOLDA());


            }

        }
    }
}


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

    public class ConnectUri {
        private final String USER_AGENT = "Mozilla/5.0";

        public static URL buidURL(String urlQuery){
            URL url = null;
            try {
                url = new URL(urlQuery.toString());
            }catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return url;
        }
        public String getResponseFromHttpUrl (URL url) throws IOException {
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try{
                InputStream in = urlConnection.getInputStream();
                Scanner scanner = new Scanner(in);
                scanner.useDelimiter("//A");
                boolean hasilInput = scanner.hasNext();
                if (hasilInput) {
                    return scanner.next();
                } else {
                    return null;
                }
            }finally {
                urlConnection.disconnect();
            }
        }
    }


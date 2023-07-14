import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class InputdariUser {
        private String ID;

    public String getID() {
        return ID;
    }

    private String NAMA;

    public String getNAMA() {
        return NAMA;
    }

    public InputdariUser(String  ID, String NAMA) {
            this.ID = ID ;
            this.NAMA = NAMA;
        }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Id1");
        arrayList.add("Nama1");
        arrayList.add("Id2");
        arrayList.add("Nama2");
        arrayList.add("Id3");
        arrayList.add("Nama3");
    }
        public static class Input {
            private static String response;

            public static void main(String[] args) {
                Scanner Scanner = new Scanner(System.in);

                System.out.println("Masukkan data : ");
                int ID = Scanner.nextInt();
                Scanner.nextLine();

                for (int i = 1; i <= ID; i++) {
                    System.out.println("\nData User ke-" + i);
                    System.out.println("ID: ");
                    String id = Scanner.nextLine();
                    System.out.println("NAMA: ");
                    String NAMA = Scanner.nextLine();


                }
            }

    }

    private static void add(InputdariUser user) {
    }
}

import java.util.ArrayList;
import java.util.Scanner;

    public class User {
        private int id;
        private String Nama;

        public User(int id, String Nama) {
            this.id = id;
            this.Nama = Nama;

        }

        public String getNama() {
            return Nama;
        }

        public int getId() {
            return id;

        }

        public static void main(String[] args) {
            ArrayList<User> datalist = new ArrayList<>();
            Scanner Scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan ID1 : ");
                int id = Scanner.nextInt();
                System.out.println("Masukkan Nama1 : ");
                String Nama = Scanner.next();
                User User = new User(id, Nama);
                datalist.add(User);

                int JumlahUser = datalist.size();
                System.out.println("jumlahUser : " + JumlahUser);
            }
        }

    }
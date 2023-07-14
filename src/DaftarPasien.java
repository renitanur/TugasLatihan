import java.util.ArrayList;
import java.util.Scanner;

public class DaftarPasien {
    public static void main(String[] args) {
        ArrayList<String> patientList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pasien: ");
        int jumlahPasien = scanner.nextInt();

        scanner.nextLine(); // Membaca karakter newline setelah membaca angka

        for (int i = 1; i <= jumlahPasien; i++) {
            System.out.print("Masukkan nama pasien " + i + ": ");
            String namaPasien = scanner.nextLine();
            patientList.add(namaPasien);
        }

        System.out.println("Daftar Pasien:");
        for (String patient : patientList) {
            System.out.println(patient);
        }
    }
}

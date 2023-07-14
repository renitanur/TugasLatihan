import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import java.util.Scanner;

public class Pasien {
    private String NIK;
    private String NAMA;
    private String ALAMAT;
    private String TGLLAHIR;
    private String JENISKELAMIN;
    private String GOLDA;

    public Pasien() {

    }


    public String getNIK() {

        return NIK;
    }

    public void setNIK(String NIK) {

        this.NIK = NIK;
    }

    public String getNAMA() {

        return NAMA;
    }

    public void setNAMA(String NAMA) {

        this.NAMA = NAMA;
    }

    public String getALAMAT() {

        return ALAMAT;
    }

    public void setALAMAT(String ALAMAT) {

        this.ALAMAT = ALAMAT;
    }

    public String getTGLLAHIR() {

        return TGLLAHIR;
    }

    public void setTGLLAHIR(String  TGLLAHIR) {

        this.TGLLAHIR = TGLLAHIR;
    }

    public String getJENISKELAMIN() {

        return JENISKELAMIN;
    }

    public void setJENISKELAMIN(String JENISKELAMIN) {

        this.JENISKELAMIN = JENISKELAMIN;
    }

    public String getGOLDA() {

        return GOLDA;
    }

    public void setGOLDA(String GOLDA) {

        this.GOLDA = GOLDA;
    }

    public Pasien(String  NIK, String NAMA, String ALAMAT, String TGLLAHIR, String JENISKELAMIN, String GOLDA) {
        this.NIK = NIK;
        this.NAMA = NAMA;
        this.ALAMAT = ALAMAT;
        this.TGLLAHIR = TGLLAHIR;
        this.JENISKELAMIN = JENISKELAMIN;
        this.GOLDA = GOLDA;
    }

    public static class pendaftaranpasien {
        private static String response;

        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);

            System.out.println("Masukkan jumlah pasien yang akan didaftarkan : ");
            int jumlahpasien = Scanner.nextInt();
            Scanner.nextLine();

            for (int i = 1; i <= jumlahpasien; i++) {
                System.out.println("\nData pasien ke-" + i);
                System.out.println("NIK: ");
                String NIK = Scanner.nextLine();
                System.out.println("NAMA: ");
                String NAMA = Scanner.nextLine();
                System.out.println("ALAMAT:");
                String ALAMAT = Scanner.nextLine();
                System.out.println("TGLLAHIR:");
                String TGLLAHIR = Scanner.nextLine();
                System.out.println("JENISKELAMIN:");
                String JENISKELAMIN = Scanner.nextLine();
                System.out.println("GOLDA:");
                String GOLDA = Scanner.nextLine();

                Pasien pasien = new Pasien(NIK, NAMA, ALAMAT, TGLLAHIR, JENISKELAMIN, GOLDA);
                pendaftaranpasien.add(pasien);

            }
        }

        private static void add(Pasien pasien) {
        }
    }
    }
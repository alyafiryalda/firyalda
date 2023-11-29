/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205020.pbo.lat51;

import java.util.Scanner;

/**
 *
 * @author ACER
 * Nama : Alya Firyalda 
 * Nim  : 22205020
 * semester : 3
 * Prodi : Teknik Informatika
 * Mata Kuliah : PBO
 */
public class PBOLat51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("====Program perhitungan Gaji Karyawan====");

        // Memasukkan data karyawan
        System.out.print("Masukkan NIK : ");
        String nik = scanner.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = scanner.nextInt();

        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = scanner.next();

        System.out.print("Masukkan Jumlah Kehadiran : ");
        int kehadiran = scanner.nextInt();

        // Membuat objek Karyawan
        Karyawan karyawan = new Karyawan(nik, nama, golongan, jabatan, kehadiran);

        // Menampilkan hasil perhitungan
        System.out.println("\n====Hasil perhitungan====");
        System.out.println("NIK : " + karyawan.getNik());
        System.out.println("NAMA : " + karyawan.getNama());
        System.out.println("Golongan : " + karyawan.getGolongan());
        System.out.println("JABATAN : " + karyawan.getJabatan());

        System.out.println("\nTUNJANGAN GOLONGAN : " + karyawan.hitungTunjanganGolongan());
        System.out.println("TUNJANGAN : " + karyawan.hitungTunjangan());
        System.out.println("TUNJANGAN KEHADIRAN : " + karyawan.hitungTunjanganKehadiran());

        System.out.println("\nGAJI TOTAL : " + karyawan.hitungGajiTotal());
    }
}

class Karyawan {
    private String nik;
    private String nama;
    private int golongan;
    private String jabatan;
    private int kehadiran;

    // Konstruktor
    public Karyawan(String nik, String nama, int golongan, String jabatan, int kehadiran) {
        this.nik = nik;
        this.nama = nama;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.kehadiran = kehadiran;
    }

    // Metode untuk mendapatkan NIK Karyawan
    public String getNik() {
        return nik;
    }

    // Metode untuk mendapatkan nama Karyawan
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan golongan Karyawan
    public int getGolongan() {
        return golongan;
    }

    // Metode untuk mendapatkan jabatan Karyawan
    public String getJabatan() {
        return jabatan;
    }

    // Metode untuk mendapatkan jumlah kehadiran Karyawan
    public int getKehadiran() {
        return kehadiran;
    }

    // Metode untuk menghitung tunjangan golongan
    public double hitungTunjanganGolongan() {
        double tunjanganGolongan = 0;
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                break;
        }
        return tunjanganGolongan;
    }

    // Metode untuk menghitung tunjangan jabatan
    public double hitungTunjangan() {
        double tunjangan = 0;
        if (jabatan.equalsIgnoreCase("Manager")) {
            tunjangan = 2000000;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            tunjangan = 1000000;
        }
        return tunjangan;
    }

    // Metode untuk menghitung tunjangan kehadiran
    public double hitungTunjanganKehadiran() {
        return kehadiran * 100000;
    }

    // Metode untuk menghitung gaji total
    public double hitungGajiTotal() {
        return hitungTunjanganGolongan() + hitungTunjangan() + hitungTunjanganKehadiran();
    }
}

    


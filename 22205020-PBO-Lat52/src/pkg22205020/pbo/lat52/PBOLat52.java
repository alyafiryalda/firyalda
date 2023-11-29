/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205020.pbo.lat52;

/**
 *
 * @author ACER
 *  Nama : Alya Firyalda 
 * Nim  : 22205020
 * semester : 3
 * Prodi : Teknik Informatika
 * Mata Kuliah : PBO
 */
public class PBOLat52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Dosen dosen = new Dosen("41227829930", "Rizki Adam Kurniawan", 27, "PBO");
        Mahasiswa mahasiswa = new Mahasiswa("10110269", "Nindi", 17, "PBO2");

        // Menampilkan informasi tentang Dosen
        System.out.println("NIP DOSEN: " + dosen.getNip());
        System.out.println("Saya Dosen");
        System.out.println("Saya " + dosen.getNama() + " umur " + dosen.getUmur() + " tahun sedang mengajar matakuliah " + dosen.getMataKuliah());
        System.out.println();

        // Menampilkan informasi tentang Mahasiswa
        System.out.println("NAMA MAHASISWA: " + mahasiswa.getNim());
        System.out.println("Saya Mahasiswa");
        System.out.println("Saya " + mahasiswa.getNama() + " umur " + mahasiswa.getUmur() + " tahun sedang belajar di kelas " + mahasiswa.getKelas());
    }
}

class Dosen {
    private String nip;
    private String nama;
    private int umur;
    private String mataKuliah;

    // Konstruktor
    public Dosen(String nip, String nama, int umur, String mataKuliah) {
        this.nip = nip;
        this.nama = nama;
        this.umur = umur;
        this.mataKuliah = mataKuliah;
    }

    // Metode untuk mendapatkan NIP Dosen
    public String getNip() {
        return nip;
    }

    // Metode untuk mendapatkan nama Dosen
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan umur Dosen
    public int getUmur() {
        return umur;
    }

    // Metode untuk mendapatkan mata kuliah yang diajar Dosen
    public String getMataKuliah() {
        return mataKuliah;
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private int umur;
    private String kelas;

    // Konstruktor
    public Mahasiswa(String nim, String nama, int umur, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
    }

    // Metode untuk mendapatkan NIM Mahasiswa
    public String getNim() {
        return nim;
    }

    // Metode untuk mendapatkan nama Mahasiswa
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan umur Mahasiswa
    public int getUmur() {
        return umur;
    }

    // Metode untuk mendapatkan kelas Mahasiswa
    public String getKelas() {
        return kelas;
    }
}

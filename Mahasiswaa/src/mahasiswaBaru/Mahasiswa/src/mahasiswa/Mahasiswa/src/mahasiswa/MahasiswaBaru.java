/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MahasiswaBaru {
      private String nim; // Change int to String
    private String nama;
    private int umur;

    public MahasiswaBaru nim, String nama, int umur) { 
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("NIM: " + (nim != null ? nim : "N/A")); // Check for null
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    private static class nama {

        public nama() {
        }
    }
}

public class MahasiswaBaru extends Mahasiswa {

    private int angkatan;

    public MahasiswaBaru(String nim, String nama, int umur, int angkatan) {
        super(nim, nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205020.latihan21.rata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author ACER
 * Nama   : Alya Firyalda
 * Kelas  : PBO Reg Pagi
 * Nim    : 22205020
 * Deskripsi Pogram : program ini berisi program rata-rata nilaic
 */
public class TI_RegPagi22205020Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input banyaknya mahasiswa
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int banyakMahasiswa = input.nextInt();

        // Inisialisasi array nilai mahasiswa
        double[] nilaiMahasiswa = new double[banyakMahasiswa];

        // Input nilai mahasiswa
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();
        }

        // Hitung rata-rata nilai mahasiswa
        double rataRata = 0.0;
        for (int i = 0; i < banyakMahasiswa; i++) {
            rataRata += nilaiMahasiswa[i];
        }
        rataRata /= banyakMahasiswa;

        // Cetak rata-rata nilai mahasiswa
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
    }
    }
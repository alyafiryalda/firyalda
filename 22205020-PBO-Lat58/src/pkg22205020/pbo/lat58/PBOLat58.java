/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205020.pbo.lat58;

/**
 *
 * @author ACER
 * Nama : Alya Firyalda 
 * Nim  : 22205020
 * semester : 3
 * Prodi : Teknik Informatika
 * Mata Kuliah : PBO
 */
public class PBOLat58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   
        Kalkulator kalkulator = new Kalkulator();

        // Menampilkan hasil perjumlahan
        int hasilJumlah = kalkulator.jumlah(3, 4);
        System.out.println("Hasil perjumlahan = " + hasilJumlah);

        // Menampilkan hasil selisih
        int hasilSelisih = kalkulator.selisih(3, 4);
        System.out.println("Hasil Selisih 3 - 4 = " + hasilSelisih);
    }
}

class Kalkulator {

    // Metode untuk menjumlahkan dua bilangan
    public int jumlah(int a, int b) {
        return a + b;
    }

    // Metode untuk menghitung selisih dua bilangan
    public int selisih(int a, int b) {
        return a - b;
    }
}

    
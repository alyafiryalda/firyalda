/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205020.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author ACER
 * Nama   : Alya Firyalda
 * Kelas  : PBO Reg Pagi
 * Nim    : 22205020
 * Deskripsi Pogram : program ini berisi program warna kepribadian
 */
public class TI_RegPagi22205020Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String penutup = "\u001b[0m";
        String foregroundMerah = "\u001b[31m";
        String foregroundHijau = "\u001b[32m";
        String foregroundKuning = "\u001b[33m";
        String foregroundBiru = "\u001b[34m";
        String foregroundUngu = "\u001b[35m";
        String foregroundCyan = "\u001b[36m";
        
        String backgroundMerah = "\u001b[41m";
        String backgroundHijau = "\u001b[42m";
        String backgroundKuning = "\u001b[43m";
        String backgroundBiru = "\u001b[44m";
        String backgroundUngu = "\u001b[45m";    
        
        Scanner scanner = new Scanner(System.in);
        System.out.print(foregroundMerah+"YUK "+penutup);
        System.out.print(foregroundHijau+"KEPRIBADIANMU "+penutup);
        System.out.print(foregroundCyan+"DARI "+penutup);
        System.out.print(foregroundUngu+"WARNA "+penutup);
        System.out.print(foregroundBiru+"FAVORITMU \n"+penutup);
        
        System.out.println(backgroundMerah+"        MERAH     "+penutup);
        System.out.println(backgroundHijau+"        HIJAU     "+penutup);
        System.out.println(backgroundKuning+"        KUNING    "+penutup);
        System.out.println(backgroundBiru+"        BIRU      "+penutup);
        System.out.println(backgroundUngu+"        UNGU      "+penutup+"\n");
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scanner.next();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();
        
        
        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama +"====");
        System.out.print("Warna favoritmu adalah ");
        
        switch (warna) {
            case "merah":
                System.out.println(foregroundMerah+"merah"+penutup);
                System.out.println("""
                                   1. Periang,
                                   2. Pemberani,
                                   3. Berani menyukai risiko dalam setiap langkah,
                                   4. Menyukai tantangan,
                                   5. Kurang sabar,
                                   6. Dapat menahan marah namunn jika sudah tahap puncak toleransi,
                                   kemarahannya akan sulit dikontrol,
                                   7. Memiliki energi kehangatan dan cinta.""");
                break;
            case "hijau":
                System.out.println(foregroundHijau+"hijau"+penutup);
                System.out.println("""
                                   1. Romantis,
                                   2. Menyukai hal yang berbau alami dan keindahan,
                                   3. Teguh pada prinsip,
                                   4. Mudah cemburu,
                                   5. Mudah merasa iri,
                                   6. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.""");
                break;
            case "kuning":
                System.out.println(foregroundKuning+"kuning"+penutup);
                System.out.println("""
                                   1. Optimis,
                                   2. Suka bergaul,
                                   3. Periang,
                                   4. Senang menolong,
                                   5. Lincah dan aktif,
                                   6. Tidak suka meremehkan kekurangan orang lain,
                                   7. Loyal,
                                   8. Hangat,
                                   9. Meskipun cenderung optimis dan idealis, seringkali goyah dan tidak stabil,
                                   10.Cenderung penakut.""");
                break;
            case "biru":
                System.out.println(foregroundBiru+"biru"+penutup);
                System.out.println("""
                                   1. menyenangkan,
                                   2. Bijaksana,
                                   3. Pembawaan diri tenang saat menghadapi masalah,
                                   4. Dinamis,
                                   5. Senang berbagi,
                                   6. Bersahabat,
                                   7. Tidak terlalu suka menjadi sorotan banyak orang,
                                   8. Menyembunyikan perasaan karena karakternya yang cenderung mencari damai.""");
                break;
            case "ungu":
                System.out.println(foregroundUngu+"ungu"+penutup);
                System.out.println("""
                                   1. Optimis,
                                   2. Tidak pernah ragu,
                                   3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,
                                   4. Memiliki ambisi yang besar,
                                   5. Memiliki empati yang besar,
                                   6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,
                                   7.Terkadang bersikap keras kepala dan angkuh""");
                break;
            default:

                System.out.println("Warna yang Anda masukkan tidak valid.");
                break;
        } 
    }
}

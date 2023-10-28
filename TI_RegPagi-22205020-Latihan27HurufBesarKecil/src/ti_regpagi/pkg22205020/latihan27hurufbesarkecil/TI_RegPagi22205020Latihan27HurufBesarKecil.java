/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205020.latihan27hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama   : Alya Firyalda
 * Kelas  : PBO Reg Pagi
 * Nim    : 22205020
 * Deskripsi Pogram : program ini berisi program huruf besar kecil
 * 
 */
public class TI_RegPagi22205020Latihan27HurufBesarKecil {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat: ");
            String kalimat = input.nextLine();
            
            // hasil formatting
            System.out.println("====Hasil Formatting====");
            System.out.println("Huruf Besar:");
            System.out.println(kalimat.toUpperCase());
            System.out.println("Huruf Kecil:");
            System.out.println(kalimat.toLowerCase());
        } 
    } 
}
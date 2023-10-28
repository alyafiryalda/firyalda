/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205020.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ACER
 * Nama   : Alya Firyalda
 * Kelas  : PBO Reg Pagi
 * Nim    : 22205020
 * Deskripsi Pogram : program ini berisi program waktu saat ini
 */
public class TI_RegPagi22205020Latihan26WaktuSaatini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date waktuSaatIni = new Date();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss", new Locale("id-ID"));
        String waktuFormat = dateFormat.format(waktuSaatIni);
        
        System.out.println("Hari ini adalah hari : " + waktuFormat);
        
    }}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205020.pbo.lat55;

/**
 *
 * @author ACER
 * Nama : Alya Firyalda 
 * Nim  : 22205020
 * semester : 3
 * Prodi : Teknik Informatika
 * Mata Kuliah : PBO
 */
public class PBOLat55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone("Samsung", "Android", "Android", 3000000, "234ibfd3840fo");
        Smartphone blackberry = new Smartphone("BlackB", "RIM", "Curve", 2000000, "BHS249");
        Smartphone nokia = new Smartphone("Nokia", "Win8", "Lumia", 1000000, "UUUQIJWORJ");

        // Menampilkan informasi setiap smartphone
        samsung.displayInfo();
        blackberry.displayInfo();
        nokia.displayInfo();
    }
}

class Smartphone {
    private String manufaktur;
    private String os;
    private String model;
    private int harga;
    private String kunci;

    // Konstruktor
    public Smartphone(String manufaktur, String os, String model, int harga, String kunci) {
        this.manufaktur = manufaktur;
        this.os = os;
        this.model = model;
        this.harga = harga;
        this.kunci = kunci;
    }

    // Metode untuk menampilkan informasi smartphone
    public void displayInfo() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);

        // Tambahkan informasi khusus berdasarkan tipe OS
        if (os.equals("Android")) {
            System.out.println("Android Key Store: " + kunci);
        } else if (os.equals("RIM")) {
            System.out.println("PIN: " + kunci);
        } else if (os.equals("Win8")) {
            System.out.println("Wp key Store: " + kunci);
        }

        System.out.println();
    }
}

    
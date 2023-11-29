/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205020.pbo.lat57;

/**
 *
 * @author ACER
 * Nama : Alya Firyalda
 * Nim  : 22205020
 * semester : 3
 * Prodi : Teknik Informatika
 * Mata Kuliah : PBO
 */
public class PBOLat57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
class Vehicle {

    protected String myBrand;
    protected String myModel;
    
    public Vehicle(){
     
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        this.myBrand = brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel = model;
    }
}

class Bicycle extends Vehicle{
    
    private int myGearCount;
    
    public Bicycle(){
        
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}

class Skateboard extends Vehicle{
    
    private double myBoardLength;
    
    public Skateboard(){
        
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}


    
    
        //Membuat objek bicycle
        Bicycle b = new Bicycle();
        b.setBrand("TrekBike");
        b.setModel("7.4Fx");
        b.setGearCount(23);
        
        System.out.println("Bicycle");
        System.out.println("Brand : " + b.getBrand());
        System.out.println("Model : " + b.getModel());
        System.out.println("Jumlah Gear : " + b.getGearCount() + "\n");
        
        //Membuat objek skateboard
        Skateboard sk = new Skateboard();
        sk.setBrand("AllySkate");
        sk.setModel("Rocket");
        sk.setBoardLength(54.5);
        
        System.out.println("Skateboard");
        System.out.println("Brand : " + sk.getBrand());
        System.out.println("Model : " + sk.getModel());
        System.out.println("Panjangnya Board : " + sk.getBoardLength());
    }
}
    
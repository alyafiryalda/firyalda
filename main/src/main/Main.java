/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 * Nama        : Alya Firyalda 
 * Prodi       : Teknik Informatika 
 * Semester    : 3 
 * Mata kuliah : PBO
 */
// Kelas Employee
class Employee {
    private String name;

    // Konstruktor
    public Employee(String name) {
        this.name = name;
    }

    // Metode work() yang akan di-implementasikan oleh kelas turunan
    public void work() {
        // Default implementation, dapat di-override oleh kelas turunan
        System.out.println(name + " is working.");
    }

    // Getter untuk atribut name
    public String getName() {
        return name;
    }
}

// Kelas turunan Manager
class Manager extends Employee {
    // Konstruktor
    public Manager(String name) {
        super(name);
    }

    // Implementasi khusus metode work() untuk Manager
    @Override
    public void work() {
        System.out.println(getName() + " is managing tasks.");
    }
}

// Kelas turunan Developer
class Developer extends Employee {
    // Konstruktor
    public Developer(String name) {
        super(name);
    }

    // Implementasi khusus metode work() untuk Developer
    @Override
    public void work() {
        System.out.println(getName() + " is developing code.");
    }
}

// Kelas turunan Designer
class Designer extends Employee {
    // Konstruktor
    public Designer(String name) {
        super(name);
    }

    // Implementasi khusus metode work() untuk Designer
    @Override
    public void work() {
        System.out.println(getName() + " is designing.");
    }
}

// Kelas utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk setiap kelas
        Manager johnManager = new Manager("John Manager");
        Developer aliceDeveloper = new Developer("Alice Developer");
        Designer bobDesigner = new Designer("Bob Designer");

        // Memanggil metode work() untuk setiap objek
        johnManager.work();
        aliceDeveloper.work();
        bobDesigner.work();
    }
}
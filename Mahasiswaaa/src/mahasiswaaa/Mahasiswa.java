/**
 * Nama        : Alya Firyalda 
 * Prodi       : Teknik Informatika 
 * Semester    : 3 
 * Mata kuliah : PBO
 */
package mahasiswaaa;

public class Mahasiswa {

    private int nim;
    private String nama;
    private int umur;

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan setter untuk nim
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    // Getter dan setter lainnya

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class MahasiswaBaru extends Mahasiswa {

    // Konstruktor
    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        setNim(nim);
    }

}

class MahasiswaLama extends Mahasiswa {

    private int angkatan;

    // Konstruktor
    public MahasiswaLama(String nama, int umur, int angkatan, int nim) {
        super(nama, umur);
        this.angkatan = angkatan;
        setNim(nim);
    }

    // Getter dan setter angkatan

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

class Main {
    public static void main(String[] args) {
        MahasiswaBaru mhsBaru = new MahasiswaBaru("Jaemin", 20, 123456);
        MahasiswaLama mhsLama = new MahasiswaLama("Alice", 22, 2019, 654321);

        // Menjalankan metode displayInfo()
        System.out.println("Mahasiswa Baru:");
        mhsBaru.displayInfo();

        System.out.println("\nMahasiswa Lama:");
        mhsLama.displayInfo();
    }
}
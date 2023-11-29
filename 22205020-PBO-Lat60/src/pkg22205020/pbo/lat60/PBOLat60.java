 * @author ACER
 * Nama : Alya Firyalda 
 * Nim  : 22205020
 * semester : 3
 * Prodi : Teknik Informatika
 * Mata Kuliah : PBO
class Akatsuki {

    protected String pakaian;
    protected String tujuan;

    public Akatsuki(String pakaian, String tujuan) {
        this.pakaian = pakaian;
        this.tujuan = tujuan;
    }

    public String getpakaian() {
        return pakaian;
    }

    public String gettujuan() {
        return tujuan;
    }

}

class Anggota extends Akatsuki {
    private String nama;
    private String asalDesa;
    private String senjata;
    private String tipeKarakter;
    private String jurusAndalan;
    private String tewas;
    private String cincin;
    private boolean havePartner;

    public Anggota(String nama, String asalDesa, String senjata, String tipeKarakter, 
                  String jurusAndalan, String tewas, String cincin, boolean 
                  havePartner, String pakaian, String tujuan) {
        super(pakaian, tujuan);
        this.nama = nama;
        this.asalDesa = asalDesa;
        this.senjata = senjata;
        this.tipeKarakter = tipeKarakter;
        this.jurusAndalan = jurusAndalan;
        this.tewas = tewas;
        this.cincin = cincin;
        this.havePartner = havePartner;
        
    }
    
    public String getnama() {
        return nama;
    }
    
    public String getsenjata() {
        return senjata;
    }

    public String gettipeKarakter() {
        return tipeKarakter;
    }

    public String getjurusAndalan() {
        return jurusAndalan;
    }

    public String gettewas() {
        return tewas;
    }

    public boolean isHavePartner() {
        return havePartner;
    }
    
    public void displayAnggota() {
        System.out.println("-------------------");
        System.out.println("Nama : " + nama);
        System.out.println("-------------------");
        System.out.println("Asal : " + asalDesa);
        System.out.println("Senjata : " + senjata);
        System.out.println("Character Type : " + tipeKarakter);
        System.out.println("Jurus Andalan : " + jurusAndalan);
        System.out.println("Cincin yang digunakan : " + cincin);
        System.out.println("Kematian : " + tewas);
        if(isHavePartner()) {
            System.out.println("Mission Type : Team");
        } else {
            System.out.println("Mission Type : Solo");
        }
        System.out.println();
    }
    
}

 class PBOlat60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        String pakaian = "Pakaian hitam beserta corak awan merah";
        String tujuan = "Menangkap Semua Jinchuriki";
        
        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Kunai", 
                        "Anbu Captain Missing Ninja", "Mangekyo Sharingan", 
                        "Kehabisan Chakra" ,"Suzaku(Merah darah)" , 
                        true, pakaian, tujuan);
        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "Samehada", 
                        "S-Rank Missing Ninja", "Shark-o-mation", "Bunuh Diri",
                        " Nanju(Bintang Selatan)",  true, pakaian, tujuan); 
        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Explosive Clay", 
                        "S-Rank Missing Ninja", "Explosive Release","Dibunuh oleh Sasuke Uchiha" , 
                        "Seiryū(Naga Biru/Hijau) ", true, pakaian, tujuan);
        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Hiruko", 
                        "S-Rank Missing Ninja from Sunagakure's Puppet Brigade",
                        "Puppet Mastery","Dibunuh oleh Sakura Haruno","Gyokunyo(Virgo)",
                        true, pakaian, tujuan);
        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "Benang hitam pada dalam tubuhnya",
                        "Zonbi Konbi", "Dapat menggunakan ke lima elemen", 
                        "Dibunuh oleh Naruto Uzumaki dengan bantuan Team 10 dan Kakashi Hatake ",
                        "Hokuto(Bintang Utara)", true, pakaian, tujuan);
        Anggota hidan = new Anggota("Hidan", "Yugakure", "Sabit besar bermata tiga",
                        "Zonbi Konbi", "Immortality ","Tidak diketahui atau disegel Shikamaru" ,
                        "Santai(Tiga Tingkatan)", true, pakaian, tujuan);
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "Ular",
                        "Legendary Sannin", "Kekuatan Ular Putih","Dibunuh dan dihidupkan oleh Sasuke Uchiha", 
                        "Sora(Langit)", false, pakaian, tujuan);
         
        System.out.println("Profile Akatsuki");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Identitas : " + itachi.getpakaian());
        System.out.println("Tujuan : " + itachi.gettujuan());
        System.out.println();

        itachi.displayAnggota();
        kisame.displayAnggota();
        deidara.displayAnggota();
        sasori.displayAnggota();
        kakuzu.displayAnggota();
        hidan.displayAnggota();
        orochimaru.displayAnggota();
       
    }

}
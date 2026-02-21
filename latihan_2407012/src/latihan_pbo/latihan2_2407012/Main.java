package latihan_pbo.latihan2_2407012;

class Cafe {
    String nama;
    String alamat;
    String menu;

    // Constructor
    Cafe(String nama, String alamat, String menu) {
        this.nama = nama;
        this.alamat = alamat;
        this.menu = menu;
    }

    // Method untuk menampilkan data
    void tampilkanInfo() {
        System.out.println("Nama Cafe  : " + nama);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Menu       : " + menu);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Halaman", "Indramayu", "Mie Goreng");
        Cafe cafe2 = new Cafe("Ranum", "Indramayu Jabar", "Roti Bakar");

        cafe1.tampilkanInfo();
        cafe2.tampilkanInfo();
    }
}
package Latihan;

public class Menu {
    String nama;
    int harga;
    int jumlah;

    // Constructor
    public Menu(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Method hitung total
    public int hitungTotal() {
        return harga * jumlah;
    }

    // Method tampilkan
    public void tampilkan() {
        System.out.println("Nama Menu  : " + nama);
        System.out.println("Harga      : " + harga);
        System.out.println("Jumlah     : " + jumlah);
        System.out.println("Total      : " + hitungTotal());
    }
}

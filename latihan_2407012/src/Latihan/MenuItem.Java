package Latihan;

public class MenuItem extends Menu{
    private int jumlah;

    public MenuItem(String nama, int harga, int jumlah) {
        super (nama, harga); 
        this.jumlah = jumlah;
    }

    // hitung total
    public int hitungTotal() {
        return harga * jumlah;
    }

    // tampilkan (override)
    @Override
    public void tampilkan() {
        super.tampilkan(); // tampilkan nama & harga dari Menu
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Total     : " + hitungTotal());
    }
}

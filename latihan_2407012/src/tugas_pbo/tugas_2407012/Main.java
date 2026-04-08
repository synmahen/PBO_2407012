package tugas_pbo.tugas_2407012;

public class Main {
    public static void main(String[] args) {
        
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunRuang bangun = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas Alas = " + bangun.hitungLuas());
        System.out.println("Volume = " + bangun.hitungVolume());
    }
}

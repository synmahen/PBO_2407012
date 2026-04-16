package tugas_pbo.tugas3_pbo;

public class SegiTiga extends BangunDatar {
      public SegiTiga (double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * varA * varB;
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + varA);
        System.out.println("Tinggi: " + varB);
        System.out.println("Luas: " + hitungLuas());
    }
}

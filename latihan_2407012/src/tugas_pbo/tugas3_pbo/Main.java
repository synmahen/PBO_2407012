package tugas_pbo.tugas3_pbo;

public class Main {
     public static void main(String[] args) {
        BangunDatar bd;

        bd = new Persegi(4);
        bd.tampilkan();

        System.out.println();

        bd = new PersegiPanjang(10, 5);
        bd.tampilkan();

        System.out.println();

        bd = new SegiTiga(6, 8);
        bd.tampilkan();
    }
}

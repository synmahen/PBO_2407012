package tugas_pbo.tugas3_pbo;

public class BangunDatar {
    protected double varA;
    protected double varB;

    //overloading

    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar(double varA) {
        this.varA = varA;
    }

    public double hitungLuas() {
        return 0;
    }

     public void tampilkan() {
        System.out.println("Luas bangun datar: " + hitungLuas());
    }
}

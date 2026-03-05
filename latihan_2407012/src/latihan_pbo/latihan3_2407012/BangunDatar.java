package latihan_pbo.latihan3_2407012;

public class BangunDatar {
    private double panjang;
    private double lebar;
    private double sisi;
    private double alas;
    private double tinggi;
    private double phi;

    public BangunDatar(){
        this.phi = 3.14;
    }

    public void setPanjang (double panjang){
        this.panjang = panjang;
    }
    public void setLebar (double lebar){
        this.lebar = lebar;
    }
    public void setSisi (double sisi){
        this.sisi = sisi;
    }
    public void setAlas (double alas){
        this.alas = alas;
    }
    public void setTinggi (double tinggi){
        this.tinggi = tinggi;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public double getSisi(){
        return sisi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }
    public double getPhi(){
        return phi;
    }
}

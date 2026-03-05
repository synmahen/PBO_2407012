package latihan_pbo.latihan3_2407012;

public class Main {
    public static void main (String[] arg) {
        SegiTiga sTiga = new SegiTiga();
        PersegiPanjang pp = new PersegiPanjang();
        JajarGenjang jGenjang = new JajarGenjang();


        pp.setPanjang(7);
        pp.setLebar(19);
        System.out.println("Lebar Persegi panjang " + pp.LebarPersegiPanjang());

        jGenjang.setAlas(17);
        jGenjang.setTinggi(7);
        System.out.println("Luas Jajar Genjang adalah : " + jGenjang.LuasJajarGenjang());


        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas segitiga adalah : " + sTiga.LuasSegiTiga());

    
//dibikin selection switch case atau if else pada bagian input variablenya dari manual nanti dibikin ada pilihan nonor 1 persegi nomor 2 perseigi panjang, nanti masukan pilihan persegi 
// nanti pas keluar di itu keluar lagi ada sisi ada panjang nya gitu jadi nginput di terminalnya

    }
}

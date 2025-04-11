package utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi, tinggi;
    private final double PI = 22.0 / 7;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.nama = "Limas Persegi";
    }

    public double getLuasPermukaan() {
        double tinggiSegitiga = Math.sqrt((tinggi * tinggi) + (sisi * sisi / 4));
        double luasSisiTegak = 4 * (0.5 * sisi * tinggiSegitiga);
        return (sisi * sisi) + luasSisiTegak;
    }

    public double getVolume() {
        return (sisi * sisi * tinggi) / 3;
    }
}

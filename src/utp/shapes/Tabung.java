package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius, tinggi;
    private final double PI = 22.0 / 7;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        this.nama = "Tabung";
    }

    public double getLuasPermukaan() {
        return 2 * PI * radius * (radius + tinggi);
    }

    public double getVolume() {
        return PI * radius * radius * tinggi;
    }
}

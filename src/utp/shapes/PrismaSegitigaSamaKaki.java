package utp.shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas, kaki, tinggi;
    private final double PI = 22.0 / 7;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
        this.nama = "Prisma Segitiga Sama Kaki";
    }

    public double getLuasPermukaan() {
        double tinggiSegitiga = Math.sqrt((kaki * kaki) - (alas * alas / 4));
        double luasAlas = 0.5 * alas * tinggiSegitiga;
        double kelilingAlas = alas + 2 * kaki;
        return 2 * luasAlas + kelilingAlas * tinggi;
    }

    public double getVolume() {
        double tinggiSegitiga = Math.sqrt((kaki * kaki) - (alas * alas / 4));
        double luasAlas = 0.5 * alas * tinggiSegitiga;
        return luasAlas * tinggi;
    }
}

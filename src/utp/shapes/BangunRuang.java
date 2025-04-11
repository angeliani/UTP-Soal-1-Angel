package utp.shapes;

public abstract class BangunRuang {
    protected String nama;
    public abstract double getLuasPermukaan();
    public abstract double getVolume();

    public void printInfo() {
        System.out.println("Nama            : " + nama);
        System.out.printf("Luas permukaan  : %.2f\n", getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", getVolume());
    }
}

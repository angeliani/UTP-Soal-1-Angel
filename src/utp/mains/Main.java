package utp.mains;

/* Angeliani Junitaviana Herman - 245150700111021
                                 888 
                                888 
                                888 
 8888b. 88888b.  .d88b.  .d88b. 888 
    "88b888 "88bd88P"88bd8P  Y8b888 
.d888888888  888888  88888888888888 
888  888888  888Y88b 888Y8b.    888 
"Y888888888  888 "Y88888 "Y8888 888 
                     888            
                Y8b d88P            
                 "Y88P"             

 */

import java.util.Scanner;
import utp.shapes.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PINK = "\u001B[38;5;213m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println(ANSI_PINK +
            "Kalkulator Bangun Ruang\n" +
            "Angeliani Junitaviana Herman\n" +
            "245150700111021" + ANSI_RESET);
        System.out.println("=============================================");


        System.out.println(ANSI_PINK + "Prisma Segitiga Sama Kaki" + ANSI_RESET);
        System.out.println("=============================================");
        System.out.print("Isikan alas     : ");
        double alas = input.nextDouble();
        System.out.print("Isikan kaki     : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiPrisma = input.nextDouble();
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        System.out.println("=============================================");
        prisma.printInfo();

        System.out.println(ANSI_PINK + "Limas Persegi" + ANSI_RESET);
        System.out.println("=============================================");
        System.out.print("Isikan sisi     : ");
        double sisi = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiLimas = input.nextDouble();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println("=============================================");
        limas.printInfo();

        System.out.println(ANSI_PINK + "Tabung" + ANSI_RESET);
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiTabung = input.nextDouble();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println("=============================================");
        tabung.printInfo();
        System.out.println("=============================================");
    }
}

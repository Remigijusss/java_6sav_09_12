package days.first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite ugi");
        double ugis = getCorrectNumb(sc, "Iveskite ugi");
        System.out.println("Iveskite svori");
        double svoris = getCorrectNumb(sc, "Iveskite svori");
        System.out.println("KMI yra " + kmi(ugis, svoris));


    }

    private static double kmi(double ugis, double svoris) {
        double kmi = svoris / Math.pow(ugis, 2);
        return kmi;
    }


    private static double getCorrectNumb(Scanner sc, String text) {

        System.out.println(text);
        double val = 0;
        while (true)
            try {
                val = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius. Pakartokite");

            }

        return val;
    }
}












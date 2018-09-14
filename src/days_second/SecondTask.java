package days_second;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        System.out.println("Pasirinkite ka norite skaiciuoti" +
                "\n1-staciojo trikampio plotas\n2-staciakampio plotas" +
                "\n3-kvadrato plotas\n4-apskritimo plotas");

        Scanner scanner = new Scanner(System.in);  //NUSKANINA KA IVEDA
        int option = scanner.nextInt();  //KINTAMASIS IS SCAN

        switch (option) {  //nusirodo reiksme arba kint
            case 1:  //kiekvienos figuros skaiciavimas
                //to do all method
                double result = triangle(scanner);
                System.out.println("Trikampio plotas yra " + result);
                break;
            case 2: //kiekvienos figuros skaiciavimas
                //to do all method
                double result1 = staciakampis(scanner);
                System.out.println("Staciakampio plotas yra" + result1);
                break;
            case 3: //kiekvienos figuros skaiciavimas
                //to do all method
                double result2 = kvadratas(scanner);
                System.out.println("kvadrato plotas yra" + result2);
                break;
            case 4: //kiekvienos figuros skaiciavimas
                //to do all method
                break;
            default:
                System.out.println("netiko nei vienas");
                break;


        }

    }

    public static double triangle(Scanner scanner) {  //nereikia antro scanner
        System.out.println("iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("iveskite b statini");
        double b = scanner.nextDouble();
        return (a * b) / 2;



    }
    public static double staciakampis (Scanner scanner){  //nereikia antro scanner
        System.out.println("iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("iveskite b statini");
        double b = scanner.nextDouble();
        return a * b;


    }


    public static double kvadratas(Scanner scanner){  //nereikia antro scanner
        System.out.println("iveskite a statini");
        double a = scanner.nextDouble();

        return a * a;


    }
}

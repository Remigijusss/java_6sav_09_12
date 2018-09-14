package days_second;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class FirstTask {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite palindroma kuri tikrinsite");
        String word = scanner.nextLine();


        if (isWordPalindrome(word.replaceAll(" ", " "))){
            System.out.println("Polindromas") ;



        } else {
            System.out.println("Nepolindronas") ;

        }

    }

    private static boolean isWordPalindrome(String text){
        boolean val = true;

        for ( int i = 0; i< text.length(); i++ ){
            char first = text.charAt(i);
            char second= text.charAt(text.length() -1-i);
            if (first !=second){
                val = false;
                break;
            }
        }
        return val;
    }



}


















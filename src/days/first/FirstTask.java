package days.first;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi");
             word = scanner.nextLine();
             int countLetters = countLetters(word);
             if (word.length() %2==0){
                 //System.out.println ("ivestas zodis" + word + " word.length() + " rasta a raidziu " + countLetters");
                 System.out.printf("Ivestas zodis %s jo ilgis yra %d", word, word.length(), countLetters);

             }else{
                 System.out.println("Ivestas zodis") ;

             }

            System.out.println(word);
        } while(!word.toLowerCase().equals("pabaiga"));

    }

    private static int countLetters(String word){
        int count = 0;

         for(int i = 0; i < word. length() ; i++){

             if ( word.charAt(i) == 'a'){
                 count ++;
             }

         }
         return count;

    }
}
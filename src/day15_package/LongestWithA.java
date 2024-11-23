package day15_package;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter three words:");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();


        // 1st - needs to contain "a"
        //      word1.contains("a")
        // 2nd - needs to be longest
        //      word1.length() > word2.length() && word1.length() > word3.length();


        boolean isFirstLongestWithA = word1.contains("a") && ( word1.length() > word2.length() && word1.length() > word3.length() );
        boolean isSecondLongestWithA = word2.contains("a") && word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestWithA = word3.contains("a") && word3.length() > word1.length() && word3.length() > word2.length();

        // TODO: Improve the code - implement the option if the words to no have "a" in it. But if there word with "a" then print that one.
        //  HINT: nested if
        if (isFirstLongestWithA){
            System.out.println(word1 + " is the longest with a");
        } else if (isSecondLongestWithA) {
            System.out.println(word2 + " is the longest with a");
        } else if (isThirdLongestWithA) {
            System.out.println(word3 + " is the longest with a");
        }



    }
}

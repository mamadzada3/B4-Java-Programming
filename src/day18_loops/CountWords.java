package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine().trim(); // This has multiple words in this sentence

        int countSpace = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                countSpace++;
            }
        }

        System.out.println("There are " + (countSpace+1)+ " words in this sentence.");

    }
}

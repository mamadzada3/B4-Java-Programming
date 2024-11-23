package day18_loops;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Anna";
        //             0123
        String reversed = "";

    /*
        check the originalWord is SAME with reversedWord
            1. reverse the word
                get ech char from end and put to the beginning
                    .charAt()
     */

        //  initialization; condition; iteration)
        for (int i = word.length()-1; i >= 0 ; i--) {
            //System.out.print( word.charAt( i )   );
            reversed += word.charAt( i );   // a | a + v | av + a | ava + j
        }


        // compare two words
        // original word vs reversed word

        // word compare  System.out.print( word.charAt( i )   );
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("It is PALINDROME");
        } else {
            System.out.println("It is NOT PALINDROME");
        }


        // With ternary
        System.out.println( word.equalsIgnoreCase(reversed) ? "It is PALINDROME" :  "It is NOT PALINDROME");

    }
}

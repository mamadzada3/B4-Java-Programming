package day05_variables;

public class MyNmae {
    public static void main( String []args){
        char letter1='G';
        char letter2='U';
        char letter3='N';
        char letter4='A';
        char letter5='Y';

        System.out.println(letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);

        System.out.println();

        // ADDITION
        System.out.println(0 + letter1);
        System.out.println(0 + letter2);
        System.out.println(0 + letter3);
        System.out.println(0 + letter4);
        System.out.println(0 + letter5);


        System.out.println();

        // ADDITION
        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5 );  // int

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5 ; // String
        System.out.println(myName);
    }

}

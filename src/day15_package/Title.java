package day15_package;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter you name with titles: ");
        String name = key.nextLine().toLowerCase(); // Mr. Tom Jerry -- > mr. tom jerry --> Hello Mister


        if (name.startsWith("mr.") || name.startsWith("mister.") ) { // startsWithIgnoreCase()
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms.") || name.startsWith("miss.") || name.startsWith("Madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor");
        }


        if (name.endsWith(" sr")) {
            System.out.println("Nice to meet you senior");
        } else if ( name.endsWith( " jr")) {
            System.out.println("Nice to meet you junior");
        }


//        String titles = "Ms.".toLowerCase();
//        switch (titles) { // Mr.Tom
//            case "mr.":  // "Mr.Tom Jerry".equals("mr.")
//                System.out.println("Hello Sir");
//                break;
//            case "ms.": // titles.equals("ms.");
//                System.out.println("Hello Ma'am");
//        }


    }
}

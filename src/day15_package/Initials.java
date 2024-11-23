package day15_package;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = keyboard.next().toUpperCase(); // tom --- > TOM
        System.out.print("Please, enter your last name: ");
        String lastName = keyboard.next().toUpperCase();

        char firstCharOfFirstName = firstName.charAt(0); // TOM -- > 'T'
        char firstCharOfLasName = lastName.charAt(0);

        System.out.println( "" + firstCharOfFirstName + firstCharOfLasName );

    }
}

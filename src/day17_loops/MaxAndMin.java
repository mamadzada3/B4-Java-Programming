package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Hey, how many numbers do you want to compare: ");
        int countOfNUm = key.nextInt(); // 8
        int cycle = 1;
        int userNum = 0;

        int biggest = -2147483648;
        int smallest = 2147483647;

//        2147483647
//        -2147483648


        while (cycle <= countOfNUm) {
            System.out.print("Please, enter the number " + cycle + ": ");
            userNum = key.nextInt();

            if (userNum > biggest){
                biggest = userNum;
            }

            if (userNum < smallest){
                smallest = userNum;
            }

            cycle++;
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);
    }

}

package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main (String []args){
        System.out.println("A sentence"); // has no space at the beginning
        System.out.println(" A sentence"); //has one space at the beginning
        System.out.println("  A sentence"); //has two spaces at the beginning
        System.out.println("   A sentence"); //has three spaces at the beginning
        System.out.println("    A sentence");  //has four spaces at the beginning
 //now i will use tab to do 4 spaces at one --  \t = 4 spaces
        System.out.println("\tA sentence");

        //lets put 2 space
        System.out.println("\t\tA sentence");

        System.out.println();

        //this is explaining new line
        System.out.println("1)Unlock the car door");
        System.out.println("2)Get into the car");
        System.out.println("3)Start the car");


        System.out.println("1)Unlock the car door ");
        System.out.println("2)Get into the car");
        System.out.println("3)Start the car");

        System.out.println("1)Unlock the car door \n2)Get into the car \n3)Start the car");


        System.out.println();

        System.out.println("Week days:\n Monday   \t\n Tuesday  \t\n Wednesday  \t\n Thursday  \t\n Friday  \t\n Saturday  \t\n Sunday ");
    }
}

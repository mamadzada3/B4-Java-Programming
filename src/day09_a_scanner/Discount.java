package day09_a_scanner;

public class Discount {
    public static void main(String[] args) {

        // boolean isWeekend, isTeacher, isOfficer, isFireFighter; // If all variable are same data type
        // boolean isWeekend = false, isTeacher = false, isOfficer = true, isFireFighter = false; // If all variable are same data type
        boolean isWeekend = true;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFireFighter = false;


        boolean isEligibleForDiscount = isWeekend && (isTeacher || isOfficer || isFireFighter);
        //                                  true  &&  ( false  ||    true   ||     false)
        //                                      true && (     true          ||     false)
        //                                             true  &&  (       true    )
        //                                                  true

        System.out.println("Is eligible for discount: " + isEligibleForDiscount);

    }
}
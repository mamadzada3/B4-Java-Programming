package day08_scanner_logical_numbers;
public class GoForWalk {
    public static void main (String []args){
        boolean isRaining = true;
        int temperature = 80;

        boolean isGoodToWalk = !isRaining && temperature > 70;
        // AND ---- > true and true ---- > true

        System.out.println("Is it good to go for a wall: " + isGoodToWalk);

    }
}

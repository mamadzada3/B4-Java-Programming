package day18_loops;

public class RemoveDuplicaes {
    public static void main(String[] args) {
        String str = "sdjkfhdskjhfskdjfh";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            // if unique DOES NOT have eachChar, then add
            if (!unique.contains("" + eachChar)){
                unique += eachChar;
            }

        }

        System.out.println("Original: " + str);
        System.out.println("Uniques: " + unique);


    }
}

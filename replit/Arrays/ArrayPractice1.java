package replit.Arrays;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        String GroceryList[] = new String[5] ;
        GroceryList[0] = "mahmut";
        GroceryList[1] = "ali";
        GroceryList[2] = "veli";
        GroceryList[3] = "deli";
        GroceryList[4] = "4950";

        System.out.println(Arrays.toString(GroceryList));

        for (String list: GroceryList ) {
            System.out.println("names : " + list);
        }
    }
}

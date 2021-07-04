package replit.Arrays;

public class forEachLoop {
    public static void main(String[] args) {
        int[] mahmut = {1,2,3,4,5,6,7,8,9};
        for (int number : mahmut) {
            if (number%2 ==0){
                System.out.println("even number : " + number);

            }
        }

    }
}

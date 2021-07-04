package replit;

public class positiveNegativeZero {
    public static void main(String[] args) {
        /* Given **int num** check if the number is positive, negative, or zero
            Hint: use 3 if statements to do this */
        int num = 5;
        int num1= 0;
        int num2= -5;
        if (num>0){
            System.out.println("Number is positive");
        } else if(num == 0 ) {
            System.out.println("Number is zero");
        } else{
            System.out.println("Number is negative");
        }
        if (num1>0){
            System.out.println("Number is positive");
        } else if(num == 0 ) {
            System.out.println("Number is zero");
        } else{
            System.out.println("Number is negative");
        }

        if (num2>0){
            System.out.println("Number is positive");
        } else if(num == 0 ) {
            System.out.println("Number is zero");
        } else{
            System.out.println("Number is negative");
        }
    }
}

package codingbatcom.warmup1;

public class or35 {
    public static void main(String[] args) {

    }
    public static boolean or35(int n) {
        if ((n%3==0) || (n%5==0)){
            return true;
        } else{
            return false;
        }
    }

}
/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false
 */
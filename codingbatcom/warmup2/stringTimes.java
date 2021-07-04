package codingbatcom.warmup2;

public class stringTimes {
    public static void main(String[] args) {

    }
    public static String stringTimes(String str, int n) {
        str= str;
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }
    }


/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
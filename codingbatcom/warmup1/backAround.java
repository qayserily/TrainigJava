package codingbatcom.warmup1;

public class backAround {
    public static void main(String[] args) {

    }
    public static String backAround(String str) {
        return str.substring(str.length()-1)+str+str.substring(str.length()-1);
    }
}
/*
Given a string, take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
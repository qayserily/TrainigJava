package KodlamaVaktiYoutube.Java80_ExceptionHandling_TryCatchFinally;

public class Try {
    public static void main(String[] args) {
        System.out.println("Program başladı");
        int a ;
        try{
           a = 2/0 ;
            System.out.println("try içerisinde");
           System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program Bitti");
        System.out.println("------------------------------------------------------------------------------------");

        int[] arr = new int[3];
        try {
            arr[4] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());

        }

        System.out.println("program bitti");
    }
}

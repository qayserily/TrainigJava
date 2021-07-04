package shortVideos;

public class MethodIntro {
    public static void main(String[] args) {
       sayHello();
       introduceYourself();
      // countFrom1to10();
       countEvenNumberFrom1to50();

    }

    public static void introduceYourself(){
        System.out.println("I am Cybertek Student");
        System.out.println("I am learning Java");
        System.out.println("I wish to become an SDET");
    }

    public static void sayHello(){
        System.out.println("Hello Cybertek Student");
        System.out.println("Welcome to Cybertek");
    }

    //count 1 to 10
    public static void countFrom1to10(){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

    }

    public static void countEvenNumberFrom1to50(){
        for (int i = 1; i < 50 ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}

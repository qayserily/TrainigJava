package replit;

import java.util.Scanner;

public class calculateTheAverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter subject name number 1 and score for this subject Math : ") ;
        double math = scanner.nextDouble() ;
        System.out.println("Please enter subject name number 2 and score for this subject Biology : ") ;
        double Biology= scanner.nextDouble() ;
        System.out.println("Please enter subject name number 3 and score for this subject English : ");
        double english = scanner.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject Chemistry : ");
        double chemistry = scanner.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject Music : ");
        double music= scanner.nextDouble();

        System.out.println("Summary : " + " Math : " + math + " Biology : " + Biology + " English : " + english + " Chemistry : " + chemistry + "Music: " + music);
        double avarage = (math+Biology+english+chemistry+music) /5 ;
        System.out.println("Your average score is : " + avarage);
        System.out.println("Thank you for using Grader!\n" +
                             "Goodbye!");

    }
}

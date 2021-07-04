package replitIsGoingOn;

import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {

            // DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            int day = scan.nextInt();

            //WRITE YOUR CODE HERE
            int number = 6;

            String numberStr = null;
            switch (number) {
                case 0:
                    numberStr = "Sunday";
                    break;
                case 1:
                    numberStr = "Monday";
                    break;
                case 2:
                    numberStr = "Tuesday";
                    break;
                case 3:
                    numberStr = "Wednesday";
                    break;
                case 4:
                    numberStr = "Thursday";
                    break;
                case 5:
                    numberStr = "Friday";
                    break;
                case 6:
                    numberStr = "Saturday";
                    break;
                default:
                    numberStr = "Not a valid day";
                    break;
            }
            System.out.println(numberStr);
        }
    }


/* Write a program that will print a week days according to the day number.
Use  Switch statement. If an invalid day is entered print: "Not a valid day" */
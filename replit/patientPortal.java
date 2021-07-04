package replit;

import java.util.Scanner;

public class patientPortal {
    public static void main(String[] args) {
        /* Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 `int` variables: `age`, `zipcode`
Declare 2 `double` variables: `height`, `weight`.
Declare `boolean` variable: `isMarried` (for marriage status).
Declare 2 `long` variables: `workPhoneNumber` and `personalPhoneNumber`.
Create a `Scanner` object named `scan`.
Execution flow with example:
```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
```
- build contacts variable by concatenating work phone, personal phone and email

- build fullName variable by concatenating first name and last name

- build address variable by concatenating street, city, state, zip code

**Output in the console:**

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true */

        System.out.println("Welcome to the patient portal!\n" +
                            "*****************************\n" +
                            "Please enter your personal information\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName= scan.next() ;
        System.out.println("Enter your last name : ");
        String lastName = scan.next();
        System.out.println("Enter your email : ");
        String email = scan.next();
        if (!email.contains("@")){
            System.out.println("Please enter true e-mail format");
        }
        System.out.println("Enter your street : ");
        String street = scan.next();
        System.out.println("Enter your city : ");
        String city = scan.next();
        System.out.println("Enter your state : ");
        String state = scan.next();
        System.out.println("Enter your zip code : ");
        int zipCode = scan.nextInt();
        if (zipCode>5){
            System.out.println("Please enter 5 digit");
        }
        System.out.println("Enter your work phone number : ");
        String phoneNumber = scan.next();
        if (phoneNumber.length()>10){
            System.out.println("Please enter 10 digit");
        }
        System.out.println("Enter your personal phone number : ");
        String personelPhoneNumber = scan.next();
        if (personelPhoneNumber.length()>10){
            System.out.println("Please enter 10 digit");
        }
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        System.out.println("Enter your height : ");
        double height = scan.nextDouble();
        System.out.println("Enter your weight : ");
        double weight = scan.nextDouble();
        System.out.println("Are you married? : (True/False)");
        boolean married = scan.nextBoolean();

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Patient personal information" );
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Address: " + street + " " + city + " " + state + " " + zipCode);
        System.out.println("Contacts: work phone number : " + phoneNumber + " personal phone number : " + personelPhoneNumber + " email : "+ email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married?: " +married);
    }
}

import java.util.Scanner;

public class consoleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select an option:\n" +
                "1) option 1\n" +
                "2) option 2\n" +
                "3) option 3                 :");
        int choosen = scanner.nextInt();
        if (choosen==1){
            System.out.println("user selected 1");
        } else if(choosen==2){
            System.out.println("user selected 2");
        } else if (choosen==3){
            System.out.println("user selected 3");
        } else {
            System.out.println("Invalid Enterance");
        }
    }
}


/* A console menu is basically a text menu. After it is outputted to the console a user input is captured.
Then the program decides what to do according to the user input (what the user selected).

This is done using separate if statements(without else) or branched if statements.

Uur console menu has 3 items called "options"*/
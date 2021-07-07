package KodlamaVaktiYoutube.Java70_MaceraOyunu.AdventureGame;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Adventure Game");
        System.out.println("Please enter your name before starting the game : ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();

    }
    public void start(){
       while (true){
           System.out.println();
           System.out.println("-------------------------------------------------------------------------------------");
           System.out.println();
           System.out.println("Please choose a place to take action : ");
           System.out.println("1. Safe House --> Your own safe place, no enemies! ");
           System.out.println("2. Cave --> Maybe you come across zombies! ");
           System.out.println("3. Forest --> Maybe you come across vampire!");
           System.out.println("4. River --> Maybe you come across bear!");
           System.out.println("5. Shop --> You can get weapons or armor");
           System.out.print("Where you want to go : ");
           int selLoc = scan.nextInt();
           while (selLoc<0 || selLoc>5){
               System.out.print("Please select a valid location : ");
               selLoc = scan.nextInt();
           }

           switch (selLoc){
               case 1:
                   location = new SafeHouse(player);
                   break;
               default:
                   location = new SafeHouse(player);
           }
           if(!location.getLocation()){
               System.out.println("Game over");
               break;
           }
       }
    }
}

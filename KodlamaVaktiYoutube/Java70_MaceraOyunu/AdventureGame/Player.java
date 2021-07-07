package KodlamaVaktiYoutube.Java70_MaceraOyunu.AdventureGame;

import java.util.Scanner;

public class Player {
    private int damage, healthy, money, rHealthy;
    private String name , cName;
    Inventory inv ;
    Scanner scan = new Scanner(System.in);

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public Player(String name) {
        this.inv = new Inventory();
        this.name = name;
    }


    public void selectCha(){
        switch (chaMenu()){
            case 1 :
                initPlayer("Samuray" ,5,21,15 );
                break;
            case 2:
                initPlayer("Archer" ,7,18,20);
                break;
            case 3:
                initPlayer("Chevalier" ,8,24,5);
                break;
            default:
                initPlayer("Samuray" ,5,21,15 );
                break;
        }
        System.out.println("Character : " + getcName() +"\t Damage :"+ getDamage() + "\t Health: "+getHealthy() + "\t Money : " + getMoney());
    }

    public int chaMenu(){
        System.out.println("Please select a character : ");
        System.out.println("1- Character: \t Samuray \t Damage = 5 \t Health = 21 \t Money = 15" );
        System.out.println("2- Character: \t Archer \t Damage = 7 \t Health = 18 \t Money = 20" );
        System.out.println("3- Character: \t Chevalier \t Damage = 8 \t Health = 24 \t Money = 5" );
        System.out.println("Your choice of character : ");
        int chaId = scan.nextInt();

        while (chaId<1 || chaId>3){
            System.out.print("Please select a valid character : ");
            chaId = scan.nextInt();
        }

        return chaId;
    }

    public int getTotalDamage(){
        return this.getDamage() + this.getInv().getDamage();
    }


    public void initPlayer(String cName, int dmg , int hlthy, int mny){
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlthy);
        setMoney(mny);
        setrHealthy(hlthy);
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }
}

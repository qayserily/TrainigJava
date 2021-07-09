package KodlamaVaktiYoutube.Java70_MaceraOyunu.AdventureGame;

public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;
    BattleLoc(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    @Override
    public boolean getLocation() {
        int obsCount = obstacle.count();
        System.out.println(this.getName() + " ,now you are here");
        System.out.println("Be careful! " + obsCount + obstacle.getName() + " live here!!!");
        System.out.println("<S> for fight or <K> for run");
        String selCase = scan.next();
        selCase = selCase.toUpperCase();
        if (selCase.equals("S")){
            if (combat(obsCount)){
                System.out.println("In " + this.getName() + "You cleared all the enemies ! ");
                return true;
            } else{
                System.out.println("You died !");
                return false;
            }
        }
        return true;
    }

    public boolean combat(int obsCount){
        for (int i = 0; i < obsCount; i++) {
            playerStats();
            enemyStats();
        }
        return true;
    }

    public void playerStats(){
        System.out.println("Player value\n--------------------------");
        System.out.println("Health : " + player.getHealthy());
        System.out.println("Damage : " + player.getTotalDamage());
        System.out.println("Money : " + player.getMoney());
        if (player.getInv().getDamage() > 0){
            System.out.println("Weapon : " + player.getInv().getwName());
        } if (player.getInv().getArmor()<0){
            System.out.println("Armor : " + player.getInv().getaName());
        }

    }

    public void enemyStats(){
        System.out.println("\n" + obstacle.getName() + " values\n--------------------------");
        System.out.println("Health : " + obstacle.getHealth());
        System.out.println("Damage : " + obstacle.getDamage());
        System.out.println("Money : " + obstacle.getAward());
    }
}

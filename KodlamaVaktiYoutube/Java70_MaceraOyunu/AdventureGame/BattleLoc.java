package KodlamaVaktiYoutube.Java70_MaceraOyunu.AdventureGame;

public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;
    protected String award;

    BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.award = award;
    }

    @Override
    public boolean getLocation() {
        int obsCount = obstacle.count();
        System.out.println(this.getName() + " ,now you are here");
        System.out.println("Be careful! " + obsCount + obstacle.getName() + " live here!!!");
        System.out.print("<S> for fight or <K> for run");
        String selCase = scan.nextLine();
        selCase = selCase.toUpperCase();
        if (selCase.equals("S")) {
            if (combat(obsCount)) {
                System.out.println("In " + this.getName() + "You cleared all the enemies ! ");
                if (this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println("You win ! " + this.award);
                    player.getInv().setFood(true);
                } else if (this.award.equals("Water") && player.getInv().isWater() == false) {
                    System.out.println("You win ! " + this.award);
                    player.getInv().setWater(true);
                } else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
                    System.out.println("You win ! " + this.award);
                    player.getInv().setFirewood(true);
                }
                return true;
            } if (player.getHealthy()<=0) {
                System.out.println("You died");
                return false;
            }
        }
            return true;
        }


        public boolean combat ( int obsCount){
            for (int i = 0; i < obsCount; i++) {
                int defObsHealth = obstacle.getHealth();
                playerStats();
                enemyStats();
                while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
                    System.out.println("<V> Hit or <K> run");
                    String selCase = scan.nextLine();
                    selCase = selCase.toUpperCase();
                    if (selCase.equals("V")) {
                        System.out.println("You hit");
                        obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                        afterHit();
                        if (obstacle.getHealth() <= 0) {
                            System.out.println("The monstar hit you !");
                            player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
                            afterHit();
                        }

                    } else {
                        return false;
                    }
                }

                if (obstacle.getHealth() < player.getHealthy()) {
                    System.out.println("You defeated the enemy ! ");
                    player.setMoney(player.getMoney() + obstacle.getAward());
                    System.out.println("Your current money : " + player.getMoney());
                    obstacle.setHealth(defObsHealth);
                } else {
                    return false;
                }
                System.out.println("---------------------------------------------*");
            }
            return true;
        }

        public void playerStats () {
            System.out.println("Player value\n--------------------------");
            System.out.println("Health : " + player.getHealthy());
            System.out.println("Damage : " + player.getTotalDamage());
            System.out.println("Money : " + player.getMoney());
            if (player.getInv().getDamage() > 0) {
                System.out.println("Weapon : " + player.getInv().getwName());
            }
            if (player.getInv().getArmor() < 0) {
                System.out.println("Armor : " + player.getInv().getaName());
            }

        }

        public void enemyStats () {
            System.out.println("\n" + obstacle.getName() + " values\n--------------------------");
            System.out.println("Health : " + obstacle.getHealth());
            System.out.println("Damage : " + obstacle.getDamage());
            System.out.println("Money : " + obstacle.getAward());
        }

        public void afterHit () {
            System.out.println("Player health : " + player.getHealthy());
            System.out.println(obstacle.getName() + " health : " + obstacle.getHealth());
        }
    }





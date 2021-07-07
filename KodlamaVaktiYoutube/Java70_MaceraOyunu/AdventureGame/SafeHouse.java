package KodlamaVaktiYoutube.Java70_MaceraOyunu.AdventureGame;

public class SafeHouse extends NormalLoc{
    SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean getLocation() {
        player.setHealthy(player.getrHealthy());
        System.out.println("You are healed");
        System.out.println("You are in the safe house now");
        return true;
    }
}

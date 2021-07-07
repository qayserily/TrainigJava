package KodlamaVaktiYoutube.Java70_MaceraOyunu.AdventureGame;

public abstract class BattleLoc extends Location {
    Obstacle obstacle;
    BattleLoc(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    @Override
    public boolean getLocation() {
        return true;
    }
}

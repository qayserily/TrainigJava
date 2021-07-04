package KodlamaVaktiYoutube.Java58_OOP_AccessModifiers;

public class Car {
    private int enginePower , engine ;
    public int speed;
    protected String color ;

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this.enginePower = 300;
        this.engine = 2500;
        this.speed = 200;
        this.color = "red";
    }

    public void print(){

        System.out.println(Car.this.engine);
    }
}
/*
1. public : bütün sınıflar erişebilir
2. private :
3. protected
4. default
 */
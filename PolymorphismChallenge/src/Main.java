class Car{
private boolean engine;
private int cylinders;
private String name;
private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return getClass().getSimpleName() +"-> getClass().getSimpleName()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> break()";
    }

}


class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
         super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> break()";
    }
}

class Ferrari extends Car{
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Main.Ferrari -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Main.Ferrari -> accelerate()";
    }

    @Override
    public String brake() {
        return "Main.Ferrari -> break()";
    }
}

public class Main {
    public static void main(String[] args){
        Car car = new Car(0, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(100, "Rock");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }


}

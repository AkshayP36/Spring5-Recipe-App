public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /*public Dog(String name, int brain, int body, int size, int weight){
        super(name, brain, body, size, weight);
    }*/

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name,1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Dog chew");
    }
    //@override
    public void eat(){
        System.out.println("Dog.dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk method");
        move(5);
    }
    public void run(){
        System.out.println("Dog run called");
        move(50);
    }
    public void move(int speed){
        System.out.println("overridden dog.move method called");
        System.out.println("calculate price = "+price(speed));
    }
    public int price(int speed){
        return speed * speed;
    }

}

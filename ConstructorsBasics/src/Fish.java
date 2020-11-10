public class Fish extends Animal{
    /*public Fish(String name, int Brain, int body, int size, int weight){
        super(name, Brain, body, size, weight);
    }*/

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }
    private void swim(){
        moveMuscles();
        moveBack();
        super.move(010);
    }
    private void moveMuscles(){

    }
    private void moveBack(){

    }
}

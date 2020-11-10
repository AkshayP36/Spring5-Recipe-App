public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
        //return this.floor.width * this.floor.length * this.carpet.cost;
        return (floor.getArea() * carpet.getCost());
    }
}

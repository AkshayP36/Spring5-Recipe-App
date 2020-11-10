public class Main {
    public static void main(String[] args){

        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,23.52);
        //Gearbox.Gear second = new Gearbox.Gear(5,26);
        System.out.println(first.driveSpeed(1000));
    }
}

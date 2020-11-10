import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGearNumber = 0;

    public Gearbox(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        this.currentGearNumber = currentGearNumber;
        this.gears.add(neutral);
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber; //This gearNumber is refering to the one defined above in this class.
            // And not to the gearNumber defined in the Parent/upper class
            this.ratio = ratio;
        }
        public double driveSpeed(int revs){
            return revs *this.ratio;
        }
    }

}

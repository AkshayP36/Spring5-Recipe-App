public class Element {
    private String name;
    private int atomicNumber;
    private double atomicMass;
    private String physicsState="Solid";

    public Element() {
        System.out.println("Calling constructor here");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getPhysicsState() {
        return physicsState;
    }

    public void setPhysicsState(String physicsState) {
        this.physicsState = physicsState;
    }
}

public abstract class AndroidPhones {
    public String companyName;
    public String modelName;
    public int androidVersionNumber;
    public double displaySize;
    public boolean doesSupportAI;

    public AndroidPhones(String companyName, String modelName, int androidVersionNumber, double displaySize, boolean doesSupportAI) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.androidVersionNumber = androidVersionNumber;
        this.displaySize = displaySize;
        this.doesSupportAI = doesSupportAI;
    }

    public abstract void purchasePhone();
    public abstract double phonePrice();
}

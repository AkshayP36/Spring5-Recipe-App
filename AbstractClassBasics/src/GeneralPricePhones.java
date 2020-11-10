public class GeneralPricePhones extends AndroidPhones{

    public GeneralPricePhones(String companyName, String modelName, int androidVersionNumber, double displaySize, boolean doesSupportAI) {
        super(companyName, modelName, androidVersionNumber, displaySize, doesSupportAI);
    }

    @Override
    public String toString() {
        return "GeneralPricePhones{" +
                "companyName='" + companyName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", androidVersionNumber=" + androidVersionNumber +
                ", displaySize=" + displaySize +
                ", doesSupportAI=" + doesSupportAI +
                '}';
    }

    @Override
    public void purchasePhone() {
        toString();
    }

    @Override
    public double phonePrice() {
        int androidVersionBasedPrice;
        int displaySizeBasedPrice;
        int AIBasedPrice;

        if(androidVersionNumber<4)
            androidVersionBasedPrice=12;
        else if(androidVersionNumber<10)
            androidVersionBasedPrice=24;
        else
            androidVersionBasedPrice=56;

        if(displaySize<5)
            displaySizeBasedPrice=32;
        else if(displaySize<10)
            displaySizeBasedPrice=64;
        else
            displaySizeBasedPrice=45;

        if(doesSupportAI)
            AIBasedPrice = 500;
        else AIBasedPrice=0;

        return androidVersionBasedPrice+displaySizeBasedPrice+AIBasedPrice;
    }
}

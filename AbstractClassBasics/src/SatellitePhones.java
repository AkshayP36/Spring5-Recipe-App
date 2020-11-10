public abstract class SatellitePhones extends AndroidPhones{

    private boolean doesBusinessPurpose;
    private boolean doesScientificResearchPurpose;
    private String reasonForSatellitePhonePurchase;

    public SatellitePhones(String companyName, String modelName, int androidVersionNumber, double displaySize, boolean doesSupportAI) {
        super(companyName, modelName, androidVersionNumber, displaySize, doesSupportAI);
    }

    @Override
    public String toString() {
        return "SatellitePhones{" +
                "companyName='" + companyName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", androidVersionNumber=" + androidVersionNumber +
                ", displaySize=" + displaySize +
                ", doesSupportAI=" + doesSupportAI +
                '}';
    }

    @Override
    public void purchasePhone() {

    }

    @Override
    public double phonePrice() {
        int androidVersionBasedPrice;
        int displaySizeBasedPrice;
        int AIBasedPrice;
        int businessBasedPurposePrice=1560;
        int scientificBasedPurposePrice = 1640;


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

        if(doesScientificResearchPurpose && doesBusinessPurpose)
        return androidVersionBasedPrice+displaySizeBasedPrice+AIBasedPrice+scientificBasedPurposePrice+businessBasedPurposePrice;
        else if(doesBusinessPurpose)
            return androidVersionBasedPrice+displaySizeBasedPrice+AIBasedPrice+businessBasedPurposePrice;
        else if(doesScientificResearchPurpose)
            return androidVersionBasedPrice+displaySizeBasedPrice+AIBasedPrice+scientificBasedPurposePrice;
        else
            return androidVersionBasedPrice+displaySizeBasedPrice+AIBasedPrice;

    }
}

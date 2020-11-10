import java.util.Scanner;

public class HighTechPhone extends SatellitePhones{
    private boolean doesBusinessPurpose;
    private boolean doesScientificResearchPurpose;
    private String reasonForSatellitePhonePurchase;
    public HighTechPhone(int androidVersionNumber, double displaySize, boolean doesSupportAI) {
        super("Googggle", "Mark-42", androidVersionNumber, displaySize, doesSupportAI);
    }

    @Override
    public String toString() {
        return "HighTechPhone{" +
                "companyName='" + companyName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", androidVersionNumber=" + androidVersionNumber +
                ", displaySize=" + displaySize +
                ", doesSupportAI=" + doesSupportAI +
                '}';
    }

    @Override
    public void purchasePhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Why to purchase an satellite phone with Android? ");
        System.out.println("Does a Business purpose? : true/false");
        doesBusinessPurpose=scanner.nextBoolean();

        System.out.println("Does a Scientific purpose? : true/false");
        doesScientificResearchPurpose=scanner.nextBoolean();

        System.out.println("Please provide an reason for your purpose:");
        reasonForSatellitePhonePurchase= scanner.nextLine();
    }

    @Override
    public double phonePrice() {
        return 2500;
    }

}

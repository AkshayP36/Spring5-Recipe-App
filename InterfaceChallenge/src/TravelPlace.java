import java.util.ArrayList;
import java.util.List;

public class TravelPlace implements ISaveable{
    private boolean isOutSideIndia;
    private double distance;
    private long expenditureAmount;
    private String placeToVisit;

    public TravelPlace(boolean isOutSideIndia, double distance, long expenditureAmount, String placeToVisit) {
        this.isOutSideIndia = isOutSideIndia;
        this.distance = distance;
        this.expenditureAmount = expenditureAmount;
        this.placeToVisit = placeToVisit;
    }

    public boolean isOutSideIndia() {
        return isOutSideIndia;
    }

    public void setOutSideIndia(boolean outSideIndia) {
        isOutSideIndia = outSideIndia;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public long getExpenditureAmount() {
        return expenditureAmount;
    }

    public void setExpenditureAmount(long expenditureAmount) {
        this.expenditureAmount = expenditureAmount;
    }

    public String getPlaceToVisit() {
        return placeToVisit;
    }

    public void setPlaceToVisit(String placeToVisit) {
        this.placeToVisit = placeToVisit;
    }

    @Override
    public String toString() {
        return "TravelPlace{" +
                "isOutSideIndia=" + isOutSideIndia +
                ", distance=" + distance +
                ", expenditureAmount=" + expenditureAmount +
                ", placeToVisit='" + placeToVisit + '\'' +
                '}';
    }

    @Override
    public List getPassangerDetails() {
        List<String> travelDetails = new ArrayList<String>();

        travelDetails.add(0, this.placeToVisit);
        travelDetails.add(1, ""+ this.isOutSideIndia);
        travelDetails.add(2,""+this.distance);
        travelDetails.add(3, ""+this.expenditureAmount);

        return travelDetails;
    }

    @Override
    public void setPassangerDetails(List<String> passangerDetails) {
        if(passangerDetails != null && passangerDetails.size()>0){
            this.placeToVisit = passangerDetails.get(0);
            this.isOutSideIndia = Boolean.parseBoolean(passangerDetails.get(1));
            this.distance = Double.parseDouble(passangerDetails.get(2));
            this.expenditureAmount = Long.parseLong(passangerDetails.get(3));
        }

    }
}

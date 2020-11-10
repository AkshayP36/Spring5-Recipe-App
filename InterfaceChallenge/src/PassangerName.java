import java.util.ArrayList;
import java.util.List;

public class PassangerName implements ISaveable{
    private int age;
    private int phoneNumber;
    private String nameOnAadhaarCard;


    public PassangerName(int age, int phoneNumber, String nameOnAadhaarCard) {
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.nameOnAadhaarCard = nameOnAadhaarCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameOnAadhaarCard() {
        return nameOnAadhaarCard;
    }

    public void setNameOnAadhaarCard(String nameOnAadhaarCard) {
        this.nameOnAadhaarCard = nameOnAadhaarCard;
    }

    @Override
    public String toString() {
        return "PassangerName{" +
                "age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", nameOnAadhaarCard='" + nameOnAadhaarCard + '\'' +
                '}';
    }

    @Override
    public List<String> getPassangerDetails() {
        List<String> passangerDetails = new ArrayList<String>();

        passangerDetails.add(0,this.nameOnAadhaarCard);
        passangerDetails.add(1, ""+this.phoneNumber);
        passangerDetails.add(2,""+this.age);

        return passangerDetails;
    }

    @Override
    public void setPassangerDetails(List<String> passangerDetails) {

        if(passangerDetails !=null && passangerDetails.size()>0){
            this.nameOnAadhaarCard = passangerDetails.get(0);
            this.phoneNumber = Integer.parseInt(passangerDetails.get(1));
            this.age= Integer.parseInt(passangerDetails.get(2));
        }

    }
}

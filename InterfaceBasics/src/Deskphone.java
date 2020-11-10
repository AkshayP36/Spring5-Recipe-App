public class Deskphone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No ation taken, desk phone do not have power on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing "+phoneNumber+" on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging=false;
            System.out.println("Desk Phone power is off or number is different");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

public class Main {
    public static void main(String[] args){
        ITelephone akshaysPhone;
        akshaysPhone = new Deskphone(123456789);
        akshaysPhone.powerOn();
        akshaysPhone.callPhone(123456789);
        akshaysPhone.answer();

        akshaysPhone= new MobilePhone(12345678);
        akshaysPhone.callPhone(12345678);
        akshaysPhone.answer();
    }
}

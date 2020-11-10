public class Main {
    public static void main(String[] args){
        GeneralPricePhones generalPricePhones = new GeneralPricePhones("Sansung", "Galaxy-Pro", 5,7,true);
        generalPricePhones.purchasePhone();
        System.out.println("General phone price = "+generalPricePhones.phonePrice());
        System.out.println(generalPricePhones.toString());

        System.out.println("************************************");
        //Can not instantiate Satellite phone calss as its an abstract class
        //SatellitePhones satellitePhones=new SatellitePhones("HTC", "Tech Master", 9, 8, true);

        HighTechPhone highTechPhone = new HighTechPhone(12,10,true);
        highTechPhone.purchasePhone();
        System.out.println("HighTech phone price = "+highTechPhone.phonePrice());
        System.out.println(highTechPhone.toString());

    }
    }


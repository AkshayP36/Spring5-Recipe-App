package com.CompositionPart1;

public class Main {
    public static void main(String[] args){
        Dimensions dimension=new Dimensions(20,20,5);
        Case theCase = new Case("2288", "Dell", "248", dimension);
        Monitor theMonitor= new Monitor("27 inch", "Acer", 27, new Resolution(2540, 1140));
        Motherboard theMotherboard = new Motherboard("i-7", "Intel", 16000, 4, "Dual");

        PC thePC= new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,7400,"White");
        thePC.getTheCase().getDimensions();
    }
}

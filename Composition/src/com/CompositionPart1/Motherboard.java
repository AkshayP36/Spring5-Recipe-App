package com.CompositionPart1;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramsSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramsSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramsSlots = ramsSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamsSlots() {
        return ramsSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is now loading....");
    }
}

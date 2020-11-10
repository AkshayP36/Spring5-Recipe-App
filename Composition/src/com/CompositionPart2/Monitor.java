package com.CompositionPart2;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution multiresolution;

    public Monitor(String model, String manufacturer, int size, Resolution multiresolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.multiresolution = multiresolution;
    }

    public void drawPixelAt(int x, int y, String colour){
        System.out.println("Drawing pixel at "+x+" y "+y+" in colour "+colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getMultiresolution() {
        return multiresolution;
    }
}

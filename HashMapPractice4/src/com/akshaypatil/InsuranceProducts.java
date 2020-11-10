package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class InsuranceProducts {
    private Map<String,String> insuranceProductList = new HashMap<>();
    private static String insuredProduct;
    private static String productName;


    //Declared the initial values for the insurance products
    public InsuranceProducts() {
    insuranceProductList.put("Health", "Life Protection");
    insuranceProductList.put("Motor", "Damage protection");
    insuranceProductList.put("Fire","Fire protection");
    insuranceProductList.put("Education", "Higher studies protection");
    }

    //To get insured product
    public String getInsuredProduct(String productName) {
        if(insuranceProductList.containsValue(productName))
        return this.insuranceProductList.get(insuredProduct);
        else
            return "This product doesn't exist. You can add it to the list.";
    }


    //To get insured Product name
    public String getProductName(String insuredProduct) {
        if(insuranceProductList.containsKey(insuredProduct))
        return this.insuranceProductList.get(productName);
        else
            return "This insuredProduct category doesn't exists. You can add it to the list.";
    }

    //Add an product to the list
    public void setInsuredProductClass(String insuredProduct,String productName) {
        if(insuranceProductList.containsKey(insuredProduct))
            System.out.println("This product already exists in the product class");
        else
        this.insuranceProductList.put(insuredProduct,productName);
    }


    //Test this toString function
    @Override
    public String toString() {
        return "InsuranceProducts{" +
                "insuranceProductList=" + insuranceProductList +
                '}';
    }


    //Pass the entire Map to get displayed
    public void getProductClass(){
        for(String key : insuranceProductList.keySet())
            System.out.println(key+" : "+insuranceProductList.get(key));
    }


    //To remove an insured product from the product class
    public void removeProduct(String insuredProduct){
        if(insuranceProductList.containsKey(insuredProduct)) {
            insuranceProductList.remove(insuredProduct);
            System.out.println("Product removed successfully");
        }
        else
            System.out.println("This product category doesn't exists. Please enter valid category..");
    }


    //Update an product from the hashMap
    public void updateProduct(String insuredProduct, String productName){
        if(insuranceProductList.containsKey(insuredProduct))
            insuranceProductList.put(insuredProduct,productName);
        else
            System.out.println("Please enter an valid insured product to update");
    }
}

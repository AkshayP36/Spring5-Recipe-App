package com.akshaypatil;

public class Players {
    private String firstName;
    private String lastName;
    private String countryName;
    private int ICCRanking;

    public Players(String firstName, String lastName, String countryName, int ICCRanking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryName = countryName;
        this.ICCRanking = ICCRanking;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getICCRanking() {
        return ICCRanking;
    }

    public void setICCRanking(int ICCRanking) {
        this.ICCRanking = ICCRanking;
    }

    @Override
    public String toString() {
        return "Players{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", ICCRanking=" + ICCRanking +
                '}';
    }
}

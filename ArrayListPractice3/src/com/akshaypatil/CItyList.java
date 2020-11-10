package com.akshaypatil;

import java.util.Objects;

public class CItyList {
    private String stateName;
    private String cityName;

    public CItyList(String stateName, String cityName) {
        this.stateName = stateName;
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CItyList cItyList = (CItyList) o;
        return stateName.equals(cItyList.stateName) &&
                cityName.equals(cItyList.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateName, cityName);
    }

    @Override
    public String toString() {
        return "CItyList{" +
                "stateName='" + stateName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}

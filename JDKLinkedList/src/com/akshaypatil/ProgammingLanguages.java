package com.akshaypatil;

import java.util.Objects;

public class ProgammingLanguages {

    private String languageName;
    private String stackLevel;

    public ProgammingLanguages(String languageName, String stackLevel) {
        this.languageName = languageName;
        this.stackLevel = stackLevel;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getStackLevel() {
        return stackLevel;
    }

    public void setStackLevel(String stackLevel) {
        this.stackLevel = stackLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgammingLanguages that = (ProgammingLanguages) o;
        return languageName.equals(that.languageName) &&
                stackLevel.equals(that.stackLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageName, stackLevel);
    }

    @Override
    public String toString() {
        return "languageName='" + languageName + '\'' +
                ", stackLevel='" + stackLevel + '\'';
    }
}

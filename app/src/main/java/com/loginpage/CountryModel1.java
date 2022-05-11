package com.loginpage;

public class CountryModel1 {

    int countriesImage;
    String countriesName;

    public CountryModel1(String countriesName, int countriesImage) {

        this.countriesImage = countriesImage;
        this.countriesName = countriesName;
    }

    public int getCountriesImage() {
        return countriesImage;
    }

    public void setCountriesImage(int countriesImage) {
        this.countriesImage = countriesImage;
    }

    public String getCountriesName() {
        return countriesName;
    }

    public void setCountriesName(String countriesName) {
        this.countriesName = countriesName;
    }

}

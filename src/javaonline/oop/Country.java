package javaonline.oop;

public class Country {
    public String name;
    public double gdp;
    public int population;

    public double getGdpPerCapita() {
        return this.gdp / this.population * 1_000_000;
    }

//    public static double getGdpPerCapita(Country country) {
//        return country.gdp / country.population * 1_000_000;
//    }
}

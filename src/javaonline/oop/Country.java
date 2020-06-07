package javaonline.oop;

public class Country {
    public String name;
    public double gdp;
    public int population;

    public Country() {
    }

    public Country(String name, double gdp, int population) {
        this.name = name;
        this.gdp = gdp;
        this.population = population;
    }

    public double getGdpPerCapita() {
        return this.gdp / this.population * 1_000_000;
    }

//    public static double getGdpPerCapita(Country country) {
//        return country.gdp / country.population * 1_000_000;
//    }
}

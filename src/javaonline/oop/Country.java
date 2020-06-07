package javaonline.oop;

public class Country {
    private String name;
    private double gdp;
    private int population;

    public Country() {
    }

    public Country(String name, double gdp, int population) {
        this.name = name;
        this.gdp = gdp;
        this.population = population;
    }

    public String getName() {
        String sizeCategory = this.population >= 10_000_000 ? "SUUR RIIK" : "VÄIKE RIIK";
        return name + " (" + sizeCategory + ")";
    }

    public void setName(String name) {
        if (name != null && name.length() > 2) {
            this.name = name;
        }
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGdpPerCapita() {
        return this.gdp / this.population * 1_000_000;
    }

//    public static double getGdpPerCapita(Country country) {
//        return country.gdp / country.population * 1_000_000;
//    }
}

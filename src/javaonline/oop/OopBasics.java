package javaonline.oop;

public class OopBasics {
    public static void main(String[] args) {
        /*
            NIMI		SKP (MUSD)	RAHVAARV
            Austraalia	1376255		25725000
            Eesti		31038		1328976
            Saksamaa	3863344		83149300
        */

        Country australia = new Country("Austraalia", 1376255, 25725000);
//        australia.name = "Austraalia";
//        australia.gdp = 1376255;
//        australia.population = 25725000;

        Country estonia = new Country();
        estonia.name = "Eesti";
        estonia.gdp = 31038;
        estonia.population = 1328976;

        Country germany = new Country("Saksamaa", 3863344, 83149300);

        System.out.println("Riik: " + australia.name);
        System.out.println("SKP: " + australia.gdp);
        System.out.println("SKP inimese kohta: " + australia.getGdpPerCapita());

        System.out.println("---");

        System.out.println("Riik: " + estonia.name);
        System.out.println("SKP: " + estonia.gdp);
        System.out.println("SKP inimese kohta: " + estonia.getGdpPerCapita());

        System.out.println("---");

        System.out.println("Riik: " + germany.name);
        System.out.println("SKP: " + germany.gdp);
        System.out.println("SKP inimese kohta: " + germany.getGdpPerCapita());

    }
}

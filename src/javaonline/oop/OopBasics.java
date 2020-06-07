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
        estonia.setName("Eesti");
        estonia.setGdp(31038);
        estonia.setPopulation(1328976);

        Country germany = new Country("Saksamaa", 3863344, 83149300);

        System.out.println("Riik: " + australia.getName());
        System.out.println("SKP: " + australia.getGdp());
        System.out.println("SKP inimese kohta: " + australia.getGdpPerCapita());

        System.out.println("---");

        System.out.println("Riik: " + estonia.getName());
        System.out.println("SKP: " + estonia.getGdp());
        System.out.println("SKP inimese kohta: " + estonia.getGdpPerCapita());

        System.out.println("---");

        System.out.println("Riik: " + germany.getName());
        System.out.println("SKP: " + germany.getGdp());
        System.out.println("SKP inimese kohta: " + germany.getGdpPerCapita());

    }
}

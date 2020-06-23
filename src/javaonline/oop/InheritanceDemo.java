package javaonline.oop;

import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {

        Republic estonia = new Republic();
        estonia.setPrimeMinister("Jüri Ratas");
        estonia.setArea(45227);
        estonia.setName("Eesti Vabariik");

        Federation usa = new Federation("Donald Trump", "Ameerika Ühendriigid", 9525067);

        Kingdom spain = new Kingdom("Felipe VI", "Hispaania Kuningriik", 505992);

        List<Country> countries =  new ArrayList<>();
        countries.add(estonia);
        countries.add(usa);
        countries.add(spain);

        System.out.println(countries);
    }

    public static class Republic extends Country {
        private String primeMinister;

        public Republic() {
            super(null, 0);
        }

        public String getPrimeMinister() {
            return primeMinister;
        }

        public void setPrimeMinister(String primeMinister) {
            this.primeMinister = primeMinister;
        }

        @Override
        public String toString() {
            return "Republic[" + primeMinister + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }

    public static class Kingdom extends Country {
        private String monarch;

        public Kingdom(String monarch, String name, int area) {
            super(name, area);
            this.monarch = monarch;
        }

        public String getMonarch() {
            return monarch;
        }

        public void setMonarch(String monarch) {
            this.monarch = monarch;
        }

        @Override
        public String toString() {
            return "Republic[" + monarch + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }

    public static class Federation extends Country {
        private String president;

        public Federation(String president, String name, int area) {
            super(name, area);
            this.president = president;
        }

        public String getPresident() {
            return president;
        }

        public void setPresident(String president) {
            this.president = president;
        }

        @Override
        public String toString() {
            return "Republic[" + president + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }

    public static class Country extends Territory {
        private String name;

        public Country(String name, int area) {
            this.name = name;
//            this.setArea(area);
            this.area = area;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Territory {
        protected int area;

        public int getArea() {
            return area;
        }

        public void setArea(int area) {
            this.area = area;
        }
    }
}

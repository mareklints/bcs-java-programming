public class ConditionalStatements {
    public static void main(String[] args) {

        // if-else-if-else
        int temperature = 24; // reaalses maailmas tuleb see info väljast programmi

        if (temperature > 25) {
            System.out.println("On väga soe!");
        } else if (temperature > 20) {
            System.out.println("On normaalne suveilm!");
        } else if (temperature > 15) {
            System.out.println("On jahe suveilm!");
        } else {
            System.out.println("On jaanipäev!");
        }

        // Tingimustehe
        String isWarm = temperature > 23 ? "jah" : "ei";

        if (temperature > 23) {
            isWarm = "jah";
        } else {
            isWarm = "ei";
        }

        System.out.println(isWarm);

        // switch
        String trafficLightColor = "red"; // red, yellow, green
        switch (trafficLightColor) {
            case "red":
                System.out.println("Please stop!");
                break;
            case "yellow":
                System.out.println("Be careful!");
                break;
            case "green":
                System.out.println("Drive normally!");
                break;
            default:
                System.out.println("Lights broken, be careful!");
        }

        if (trafficLightColor.equals("red")) {
            System.out.println("Please stop!");
        } else if (trafficLightColor.equals("yellow")) {
            System.out.println("Be careful!");
        } else if (trafficLightColor.equals("green")) {
            System.out.println("Drive normally!");
        } else {
            System.out.println("Lights broken, be careful!");
        }

    }
}

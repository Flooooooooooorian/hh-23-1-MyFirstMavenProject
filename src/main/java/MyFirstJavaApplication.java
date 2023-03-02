import java.util.Arrays;

public class MyFirstJavaApplication {
    public static void main(String[] args) {
        //Typ Name     = Wert
        int kontoStand = 30;

        int kontoStandSara = 50;

        int summe = kontoStand * kontoStandSara;

        boolean verschuldet = true;

        String name = "Florian";
        System.out.println(kontoStand);
        System.out.println(kontoStandSara);
        System.out.println(summe);
        System.out.println("Hallo" + name);

        System.out.println(name == "Florian");


        int value1 = 3;
        int value2 = 7;

        System.out.println(value1 + value2);
        System.out.println(value1 - value2);
        System.out.println(value1 * value2);
        System.out.println(value1 / value2);

        int myValue = 8;
        if (myValue >= 10) {
            System.out.println("Die Zahl ist größer als Zehn!");
        } else {
            System.out.println("Die Zahl ist kleiner/gleich Zehn!");
        }

        String teilnehmerA = "Lukas";
        String teilnehmerB = "Hozan";
        String teilnehmerC = "Abdul";

        String[] teilnehmer = new String[4];

        teilnehmer[0] = "Lukas";
        teilnehmer[1] = "Hozan";
        teilnehmer[2] = "Abdul";
        teilnehmer[3] = "Sara";

        System.out.println(teilnehmer[0]);
        System.out.println(Arrays.toString(teilnehmer));

        teilnehmer[0] = "Florian";
        System.out.println(Arrays.toString(teilnehmer));

        int value = 17;

        int result = duplicate(value, "Hallo");
        duplicate(23, "Bye");

        System.out.println(result);
    }

    public static int duplicate(int value, String text) {
        System.out.println("duplicate " + value * 2 + text);
        return value * 2;
    }

    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static boolean isBiggerThanAHundret(int value) {
        return value > 100;
    }
}

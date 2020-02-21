package at.jku;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String eingabeUnverschluesselt = "DASISTDERTEXT";

        System.out.println("Caeser + add from git hub");

        String verschluesselung = "";

        int stringLaenge = eingabeUnverschluesselt.length();

        int counter = 10;

        for (int i = 0; i < stringLaenge; i++) {
            char car = eingabeUnverschluesselt.charAt(i);
            car += counter;
            verschluesselung += car;

            counter++;

            if (counter > 20) {
                counter = 7;
            }

            System.out.print(car);

        }

        System.out.println(verschluesselung);

        stringLaenge = verschluesselung.length();

        String entschluesselt ="";

        counter = 10;
        for (int i = 0 ; i < stringLaenge ; i++){
            char car = verschluesselung.charAt(i);
            car -= counter;
            entschluesselt += car ;

            counter++;

            if (counter > 20) {
                counter = 7;
            }

        }

        System.out.println(entschluesselt);


    }
}

package at.jku;

public class Main {

    public static void main(String[] args) {
        // write your code here
//write some cool stuff
        String eingabeUnverschluesselt = "?DAS!ISTDERTEXTUNDNOCHETWAS!JJJ?";

        System.out.println(eingabeUnverschluesselt);

        String verschluesselung = "";

        verschluesselung = encryption(eingabeUnverschluesselt, false);

        System.out.println(verschluesselung);

        System.out.println(verschluesselung);

        String entschluesselt = "";

        entschluesselt = encryption(verschluesselung, true);

        System.out.println(entschluesselt);

    }

    private static String encryption(String inputString, boolean decrypt) {
        int counter = 10;
        int stringLaenge = inputString.length();
        String verschluesselung = "";

        /*int counterSonderzeichen1 = 3 ;
        boolean sonderZeichen1Aktive = false ;
        if (counterSonderzeichen1%9==0) {
            sonderZeichen1Aktive=true;
        }

        if(sonderZeichen1Aktive){
            if (!decrypt){

            verschluesselung +="!";
        }*/


        for (int i = 0; i < stringLaenge; i++) {

            char car = inputString.charAt(i);

            if (!((car == '!') || (car == '?'))) {
                if (!decrypt) {
                    car += counter;
                } else {
                    car -= counter;
                }
            }

            verschluesselung += car;

            counter++;

            // Verschlüsselungslogik
            if (counter > 20) {
                counter = 7;
            }

        }
        return verschluesselung;
    }
}

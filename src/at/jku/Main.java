package at.jku;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Eingabetext
        String eingabeUnverschluesselt = "";//""?IIIIIIIII??ÄÜÖÖÜÄ!!DAS!ISTDERTEXTUNDNOCHETWAS!undJohannesKüng?jkjl!";

        // Ergänzung Eingabemöglichkeit
        System.out.println("Was möchten sie verschlüsseln? Bitte eingeben:");
        Scanner scanner = new Scanner(System.in) ;

        eingabeUnverschluesselt = scanner.nextLine();//  scanner.next();
        System.out.println("Der Eingabe String lautet:\t\t\t" + eingabeUnverschluesselt);


        // Alles auf GROSS Buchstaben umwandeln
        String eingabeUnverschluesseltBearbeitet = eingabeUnverschluesselt.toUpperCase();
        System.out.println("Der Eingabe String bearbeitet:\t\t" + eingabeUnverschluesseltBearbeitet);

        //Umlaute ersetzen
        eingabeUnverschluesseltBearbeitet = stringOhneUmlaute(eingabeUnverschluesseltBearbeitet);
        System.out.println("Der Eingabe String bearbeitet:\t\t" + eingabeUnverschluesseltBearbeitet);

        // Verschlüsseln
        String stringVerschluesselt = encryption(eingabeUnverschluesseltBearbeitet, false);
        System.out.println("Der verschlüsselte String lautet:\t" + stringVerschluesselt);

        // Entschlüsseln
        String stringEntschluesselt = encryption(stringVerschluesselt, true);
        System.out.println("Der entschlüsselte String lautet:\t" + stringEntschluesselt);

    }

    private static String stringOhneUmlaute(String inputString) {

        String stringOhneUmlauteIntern = inputString.replaceAll("Ä", "AE");
        stringOhneUmlauteIntern = stringOhneUmlauteIntern.replaceAll("Ö", "OE");
        stringOhneUmlauteIntern = stringOhneUmlauteIntern.replaceAll("Ü", "UE");
        return stringOhneUmlauteIntern;

    }

    private static String encryption(String inputString, boolean decrypt) {

        int stringLaenge = inputString.length();
        String verschluesselung = "";

        int decryptOffset = 3;

        for (int i = 0; i < stringLaenge; i++) {

            char car = inputString.charAt(i);

            decryptOffset = decryptOffset + i * 3;

            while (decryptOffset > 10) {
                decryptOffset -= 8;
            }

            if (!((car == '!') || (car == '?'))) {
                if (!decrypt) {
                    //car += counter;
                    car += decryptOffset;
                } else {
                    //car -= counter;
                    car -= decryptOffset;
                }
            }

            // String wieder zusammenbauen
            verschluesselung += car;

        }
        return verschluesselung;
    }
}

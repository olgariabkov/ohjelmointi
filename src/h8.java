import java.util.Random;
import java.util.Scanner;

public class h8 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random random = new Random();

        int pelaajaVoitot = 0;
        int tietokoneVoitot = 0;
        boolean pelikaynnissa = true;

        System.out.println("Tervetuloa pelaamaan. Syötä kivi, paperi tai sakset. Lopeta l ");

        //jatka kunnes jompikumpi saa 3 voittoa
        while (pelaajaVoitot < 3 && tietokoneVoitot < 3) {
            System.out.println("Valitse kivi, paperi tai sakset: ");
            String pelaajaValinta = lukija.nextLine();

            //Tarkistetaan, haluaako käyttäjä lopettaa pelin
            if (pelaajaValinta.equals("l")) {
                System.out.println("Peli lopetettiin ");
                pelikaynnissa = false;
                break;
            }

            //tarkistetaan käyttäjän syöte
            if (!pelaajaValinta.equals("kivi") && !pelaajaValinta.equals("paperi") && !pelaajaValinta.equals("sakset")) {
                System.out.print("Virheellinen syöte. Yritä uudelleen. ");
                continue;
            }

            // Tietokoneen valinta (0 kivi, 1 paperi, 2 sakset)
            int tietokoneenNumero = random.nextInt(3);
            String tietokoneValinta = generoiTietokoneValinta(tietokoneenNumero);

            System.out.println("Tietokone valitsi: " + tietokoneValinta);

            //Tarkistetaan voittaja
            int tulos = tarkistaVoittaja(pelaajaValinta, tietokoneValinta);

            if (tulos == 1) {
                System.out.println("Voitit: ");
                pelaajaVoitot++;
            } else if (tulos == -1) {
                System.out.println("Tietokone voitti ");
                tietokoneVoitot++;
            } else {
                System.out.println("Tasapeli ");

            }

            System.out.println("Sinä: " + pelaajaVoitot + " - tietokone: " + tietokoneVoitot);
        }

        //Tulostetaan lopputulos
        if (pelaajaVoitot == 3) {
            System.out.println("Voitit ");
        } else if (tietokoneVoitot == 3) {
            System.out.println("Tietokone voitti ");
        }

        System.out.println("Sinä: " + pelaajaVoitot + " - " + "tietokone: " + tietokoneVoitot);
        lukija.close();
    }

    //Generoi tietokonevalinta
    public static String generoiTietokoneValinta(int numero) {
        if (numero == 0) {
            return "kivi";
        } else if (numero == 1) {
            return "paperi";
        } else {
            return "sakset";
        }
    }

    //Tarkistaa voittajan
    public static int tarkistaVoittaja(String pelaaja, String tietokone) {
        if (pelaaja.equals(tietokone)) {
            return 0; //Tasapeli
        } else if ((pelaaja.equals("kivi") && tietokone.equals("sakset")) ||
                (pelaaja.equals("sakset") && tietokone.equals("paperi")) ||
                (pelaaja.equals("paperi") && tietokone.equals("kivi"))){
            return 1; //pelaaja voittaa
        } else {
            return -1; //Tietokone voittaa
        }
    }
}

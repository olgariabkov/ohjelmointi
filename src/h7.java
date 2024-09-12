import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Kysytään jonon maksimiarvo
        System.out.print("Syötä maksimiarvo: ");
        int maksimiarvo = lukija.nextInt();

        //tarkistetaan onko syöte negatiivinen
        if (maksimiarvo < 0) {
            System.out.println("Jonossa termit: ");
            System.out.println("Termien määrä: 0");
            System.out.println("Termien summa: 0");
            System.out.println("Termien neliösumma: ");

        } else {

            //Lasketaan määrä, summa ja neliöiden summa
            int termienMaara = maksimiarvo / 3;
            //int termienSumma = lasketermienSumma(maksimiarvo);
            //int termienNeliosumma = lasketermienNelioSumma(maksimiarvo);

            //Tulostetaan jonon termit
            tulostaJononTermit(maksimiarvo);

            //Tulostetaan tulokset
            System.out.println("Termien määrä: " + termienMaara);
            System.out.println("Termien summa: " + lasketermienSumma(maksimiarvo));
            System.out.println("Termien neliosumma: " + lasketermienNelioSumma(maksimiarvo));
        }

        lukija.close();
    }
    //Laskee termien maara
    public static int lasketermienSumma(int maksimiarvo) {
        int termienMaara = maksimiarvo / 3; //jakamalla 3 saadaan termien määrä
        int viimeinenTermi = termienMaara * 3;
        return (termienMaara * (3 + viimeinenTermi)) / 2;
    }
    //laskee summan
    public static int lasketermienNelioSumma(int maksimiarvo) {
        int termienNeliosumma = 0;
        for (int i = 1; i <= maksimiarvo / 3; i++) {
            int termi = 3 * i;
            termienNeliosumma += termi * termi;
        }

        return termienNeliosumma;

    }


        //tulostaa jonon termit
    public static void tulostaJononTermit(int maksimiarvo) {
        System.out.println("Jonossa termit: ");
        for (int i = 3; i <= maksimiarvo; i += 3) {
            System.out.print(i + " ");
        }
    }
    }




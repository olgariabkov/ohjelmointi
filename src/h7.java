import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Kysytään jonon maksimiarvo
        System.out.print("Syötä maksimiarvo: ");
        int maksimiarvo = lukija.nextInt();

        //Lasketaan määrä, summa ja neliöiden summa
        int termienMaara = lasketermienMaara(maksimiarvo);
        int termienSumma = lasketermienSumma(maksimiarvo);
        int termienNeliosumma = lasketermienNelioSumma(maksimiarvo);

        //Tulostetaan jonon termit
        tulostaJononTermit(maksimiarvo);

        //Tulostetaan tulokset
        System.out.println("Termien määrä: " + termienMaara);
        System.out.println("Termien summa: " + termienSumma);
        System.out.println("Termien neliosumma: " + termienNeliosumma);

        lukija.close();
    }
    //Laskee termien maara
    public static int lasketermienMaara(int maksimiarvo) {
        int termienMaara = maksimiarvo / 3; //jakamalla 3 saadaan termien määrä
        return termienMaara;
    }
    //laskee summan
    public static int lasketermienSumma(int maksimiarvo) {
        int termienMaara = lasketermienMaara(maksimiarvo);
        int viimeinenTermi = termienMaara * 3; //viimeinen termi on 3 * määrä
        int termienSumma = (termienMaara * (3 + viimeinenTermi)) / 2; // AP-sarjan summakaava: n/2 * (a + 1)
        return termienSumma;

    }
    //laskee termien neliöiden summan
    public static int lasketermienNelioSumma(int maksimiarvo) {
        int termienMaara = lasketermienMaara(maksimiarvo);
        int termienNeliosumma = 0;
        for (int i = 1; i <= termienMaara; i++) {
            int termi = 3 * i;
            termienNeliosumma += termi * termi; //neliön summa
        }
        return termienNeliosumma;
        }

        //tulostaa jonon termit
    public static void tulostaJononTermit(int maksimiarvo) {
        System.out.println("Jonossa termit: ");
        for (int i = 3; i < maksimiarvo; i += 3) {
            System.out.print(i + " ");
        }
    }
    }




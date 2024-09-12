import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Taulukoiden_lajittelu {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random random = new Random();

    //numerotaulukko syöt
    int[] numerot = new int[10];
        System.out.println("Syötä 10 numeroa: ");
        for (int i = 0; i < numerot.length; i++) {
        System.out.print("Numero " + (i + 1) + ": ");
        numerot[i] = lukija.nextInt();
    }
    //Merkkijono taulukko
    String[] merkkijono = new String[10];
        System.out.println("Syötä 10 merkkijonoa: ");
        for (int i = 0; i < merkkijono.length; i++) {
        merkkijono[i] = lukija.next();
    }

    //Satunnainen numerotaulukko
    int[] satunnais = new int[10];
        for (int i = 0; i < satunnais.length; i++) {
        satunnais[i] = random.nextInt(100); //generoidaan luku 0-99
    }
        //Lajitellaan numerotaulukot ja merkkijonotaulukko

        Arrays.sort(numerot);
        Arrays.sort(merkkijono);
        Arrays.sort(satunnais);

    //Tulostetaan numerotaulukko
        System.out.println("Numerotaulukkko käyttäjän syöteellä:");
        for (int i = 0; i < numerot.length; i++) {
        System.out.print(numerot[i] + " ");
    }
    //Tulostetaan merkkijonotaulukko
        System.out.println("\n\nMerkkijonotaulukko: ");
        for (int i = 0; i < merkkijono.length; i++) {
        System.out.print(merkkijono[i] + " ");
    }
    //Tulostetaan satunnaisesti numerotaulukko
        System.out.println("\n\nSatunnaistaulukko: ");
        for (int i = 0; i < satunnais.length; i++) {
        System.out.print(satunnais[i] + " ");
    }
        lukija.close();
}
}



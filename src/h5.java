import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // metodi laskeNegatiivisetluvut
        int negatiivisetluvut = laskeNegatiivisetluvut(lukija);
        int parillisetluvut = laskeParillisetluvut(lukija);

        // Tulostetaan negatiiviset luvut
        System.out.println("Negatiiviset luvut: " + negatiivisetluvut);
        System.out.println("Parillisetluvut: " + parillisetluvut);

        lukija.close();

    }

    // Metodi laskee negatiiviset luvut
    public static int laskeNegatiivisetluvut(Scanner lukija) {
        int negatiivisetluvut = 0;
        int luku;

        System.out.print("Syötä kokonaisluku (0 lopettaa): ");
        while (true) {
            System.out.print("Luku: ");
            luku = lukija.nextInt();

            if (luku == 0) {
                break; //Lopetetaan jos luku on 0
            }

            if (luku < 0) {
                negatiivisetluvut++; //Lisätään negatiivisten luvut
            }
        }

        return negatiivisetluvut;

    }
    //Metodi parilliset luvut
    public static int laskeParillisetluvut(Scanner lukija) {
        int parillisetluvut = 0;
        int luku;

        System.out.print("Syötä kokonaisluku (0 lopettaa): ");
        while (true) {
            System.out.print("Luku: ");
            luku = lukija.nextInt();

            if (luku == 0) {
                break;
            }

            if (luku % 2 == 0) {
                parillisetluvut++;
            }
        }
        return parillisetluvut;

    }
}



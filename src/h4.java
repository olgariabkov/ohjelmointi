import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    // metodi laskeNegatiivisetluvut
    int negatiivisetluvut = laskeNegatiivisetluvut(lukija);

    // Tulostetaan negatiiviset luvut
    System.out.println("Negatiiviset luvut: " + negatiivisetluvut);

    lukija.close();

}

// Metodi laskee negatiiviset luvut
public static int laskeNegatiivisetluvut(Scanner lukija) {
    int negatiivisetluvut = 0;
    int luku;

    //Toistetaan, kunnes syöttää 0
    while (true) {
        System.out.print("Syötä kokonaisluku (0 lopettaa): ");
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
}

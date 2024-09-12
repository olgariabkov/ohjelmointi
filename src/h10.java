import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class h10 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        HashMap<String, List<String>> puhelinluettelo = new HashMap<>();
        boolean kaynnissa = true;

        System.out.println("Puhelinluettelo ");
        while (kaynnissa) {
            System.out.print("1 haku, 2 lisää, 3 lopettaa: ");
            String komento = lukija.nextLine();

            switch (komento) {
                case "1":
                    //Haku
                    System.out.println("nimi");
                    String hakunimi = lukija.nextLine();
                    if (puhelinluettelo.containsKey(hakunimi)) {
                        List<String> numerot = puhelinluettelo.get(hakunimi);
                        for (String numero : numerot) {
                            System.out.println(numero);
                        }
                    } else {
                        System.out.println("ei numeroa");
                    }
                    break;

                    case "2":
                        //lisää uusi nimi ja numero
                        System.out.println("nimi, numero: ");
                        String syote = lukija.nextLine();
                        String[] osat = syote.split(",");
                        if (osat.length == 2) {
                            String nimi = osat[0];
                            String numero = osat[1];

                            puhelinluettelo.put(nimi, new ArrayList<>());
                            puhelinluettelo.get(nimi).add(numero);

                            System.out.println("ok!");
                        } else {
                            System.out.println("Virheellinen syöte");
                        }
                        break;
                        case "3":
                            //Lopetus
                            System.out.println("lopetetaan ");
                            kaynnissa = false;
                            break;

                default:
                    System.out.println("Virhe");
                    break;
            }
        }
        lukija.close();
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class h10b {
    private static final String tiedosto = "puhelinluettelo.txt";
    private static HashMap<String, List<String>> puhelinluettelo = new HashMap<>();

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Ladataan tiedot tiedostosta
        lataaTiedot();

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

                        //Talennetaan tiedot tiedostoon
                        talennaTiedot();

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

    //metodi tietojen lataaminen tiedostosta
    private static void lataaTiedot() {
        try (BufferedReader lukija = new BufferedReader(new FileReader(tiedosto))) {
            String rivi;
            while ((rivi = lukija.readLine()) != null) {
                String[] osat = rivi.split(",");
                String nimi = osat[0];
                String numero = osat[1];

                puhelinluettelo.putIfAbsent(nimi, new ArrayList<>());
                puhelinluettelo.get(nimi).add(numero);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt");
        } catch (IOException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }

    //metodi tietojen tallentamiseen
    private static void talennaTiedot() {
        try (PrintWriter kirjoittaja = new PrintWriter(new FileWriter(tiedosto))) {
            for (String nimi : puhelinluettelo.keySet()) {
                List<String> numerot = puhelinluettelo.get(nimi);
                for (String numero : numerot) {
                    kirjoittaja.println(nimi + ", " + numero);
                }
            }

        } catch (IOException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}



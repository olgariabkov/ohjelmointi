import java.util.Random;

public class h9 {
    public static void main(String[] args) {
        //Tulostusmetodi, satunaislukugeneraattori
        tulostaSatunainenNumero();
    }

    //metodi, joka palauttaa satunainen numeron 1-6
    public static int generoiNumero() {
        Random random = new Random();
        return random.nextInt(6) + 1; //numero välillä 1-6
    }

    //metodi joka tulostaa satunainen numeron
    public static void tulostaSatunainenNumero() {
        int satunnainenNumero = generoiNumero(); //kutsutaan generaattorimetodi
        System.out.println("Random number is: " + satunnainenNumero);
    }
}

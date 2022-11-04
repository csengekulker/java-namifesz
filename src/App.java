import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Nyilvantartas nyilvan = new Nyilvantartas();

        ArrayList<String> nevlista = nyilvan.getNames();

        for (String nev : nevlista) {
            System.out.println(nev);
        }
    }
}

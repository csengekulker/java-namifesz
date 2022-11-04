import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Nev nevek = new Nev();

        ArrayList<String> nevlista = nevek.getNames();

        for (String nev : nevlista) {
            System.out.println(nev);
        }
    }
}

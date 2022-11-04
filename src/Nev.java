import java.util.ArrayList;
import java.util.Arrays;

public class Nev implements Nyilvantartas {
    public ArrayList<String> getNames() {
        String[] nevek = {"Béla", "Géza"};

        ArrayList<String> nevlista = new ArrayList<>(Arrays.asList(nevek));

        return nevlista;
    }
}

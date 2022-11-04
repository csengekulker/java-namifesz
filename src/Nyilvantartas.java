import java.util.ArrayList;
import java.util.Arrays;

public class Nyilvantartas implements Interface {
    public ArrayList<String> getNames() {
        String[] nevek = {"Béla", "Géza"};

        ArrayList<String> nevlista = new ArrayList<>(Arrays.asList(nevek));

        return nevlista;
    }
}

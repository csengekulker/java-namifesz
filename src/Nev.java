/*
* File: Nev.java
* Author: Balogh Csenge
* Copyright: 2021, Balogh Csenge
* Group: Szoft_II_N
* Date: 2022-11.04
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Nev implements Nyilvantartas {
    public ArrayList<String> getNames() {
        String[] nevek = {"Béla", "Géza"};

        ArrayList<String> nevlista = new ArrayList<>(Arrays.asList(nevek));

        return nevlista;
    }
}

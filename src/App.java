/*
* File: App.java
* Author: Balogh Csenge
* Copyright: 2021, Balogh Csenge
* Group: Szoft_II_N
* Date: 2022-11.04
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Balogh Csenge | Szoft_II_N | 2022.11.04");

        Nev nevek = new Nev();

        ArrayList<String> nevlista = nevek.getNames();

        for (String nev : nevlista) {
            System.out.println(nev);
        }
    }
}

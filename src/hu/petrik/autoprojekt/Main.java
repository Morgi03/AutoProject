package hu.petrik.autoprojekt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Auto> autok = new ArrayList<>();

    public static void main(String[] args) {
        Porsche porsche1 = new Porsche(320);
        Porsche porsche2 = new Porsche(370);
        Porsche porsche3 = new Porsche(340);
        Tesla tesla1 = new Tesla();
        Tesla tesla2 = new Tesla();
        autok.add(porsche1);
        autok.add(porsche2);
        autok.add(porsche3);
        autok.add(tesla1);
        autok.add(tesla2);
        for (Auto a : autok) {
            System.out.println("Gyorsulás előtt: " + a.getSebesseg());
            a.gyorsul();
            System.out.println("Gyorsulás után: " + a.getSebesseg());
        }
    }
}

package net.aymane.pres;

import net.aymane.ext.DaoImplV2;
import net.aymane.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2(); // DAO
        MetierImpl metier = new MetierImpl(); // Métier
        metier.setDao(dao); // Injection des dépendances
        System.out.println("Res = " + metier.calcul());
    }
}
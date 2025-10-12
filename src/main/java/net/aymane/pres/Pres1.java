package net.aymane.pres;

import net.aymane.dao.DaoImpl;
import net.aymane.ext.DaoImplV2;
import net.aymane.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
//        DaoImpl d = new DaoImpl();
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); // Injcetion des dépendances
        System.out.println("RES = "+metier.calcul());
    }
}
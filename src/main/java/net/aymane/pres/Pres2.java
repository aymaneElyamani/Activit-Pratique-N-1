package net.aymane.pres;

import net.aymane.dao.IDao;
import net.aymane.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        // Lecture du fichier de configuration
        try (Scanner scanner = new Scanner(new File("config.txt"))) {

            //Lecture de la classe DAO
            String daoClassName = scanner.nextLine().trim();
            Class<?> cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

            //Lecture de la classe Metier
            String metierClassName = scanner.nextLine().trim();
            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            //Affichage du résultat
            System.out.println("Res = " + metier.calcul());
        }
    }
}

package net.aymane.metier;

import net.aymane.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double d = dao.getData();
        double res= d*10;
        return res;
    }

    /*
    Pour Injecter dans la variable dao
    un objet d'une classe qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
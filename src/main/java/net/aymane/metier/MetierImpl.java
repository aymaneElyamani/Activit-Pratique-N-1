package net.aymane.metier;

import net.aymane.Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    // Injection de dépendance via setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 2;
    }
}
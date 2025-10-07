package net.aymane.metier;

import net.aymane.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 4 * Math.PI/2;
    }
    // Injection par setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
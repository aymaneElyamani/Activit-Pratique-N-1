package net.aymane.ext;

import net.aymane.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double d = 20;
        return d;
    }
}
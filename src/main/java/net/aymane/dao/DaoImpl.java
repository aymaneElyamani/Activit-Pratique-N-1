package net.aymane.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return 100;
    }
}
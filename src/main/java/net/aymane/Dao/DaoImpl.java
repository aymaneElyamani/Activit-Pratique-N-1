package net.aymane.Dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return Math.random() * 100;
    }
}
package dao;

public class DaoImplementation2 implements DaoInterface{

    @Override
    public double getData() {
        System.out.println("WEB SERVER VERSION :");
        double data = 55;
        return data;
    }
}

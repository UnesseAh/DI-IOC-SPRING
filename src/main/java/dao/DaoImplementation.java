package dao;

public class DaoImplementation implements DaoInterface{
    @Override
    public double getData() {
        System.out.println("Data base version : ");
        double data =  34;
        return data;
    }
}

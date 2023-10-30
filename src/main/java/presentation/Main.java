package presentation;

import dao.DaoImplementation;
import dao.DaoImplementation2;
import dao.DaoInterface;
import service.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        DaoImplementation2 dao = new DaoImplementation2();
        ServiceImpl service = new ServiceImpl();
        service.setDao(dao);
        System.out.println("RES: " + service.calculate());
    }
}
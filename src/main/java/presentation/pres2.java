package presentation;

import dao.DaoImplementation2;
import service.ServiceImpl;

public class pres2 {
    public static void main(String[] args){
        DaoImplementation2 dao = new DaoImplementation2();
        ServiceImpl service = new ServiceImpl();
        service.setDao(dao);
        System.out.println(service.calculate());
    }
}

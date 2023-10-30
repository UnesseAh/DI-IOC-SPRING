package service;

import dao.DaoInterface;

public class ServiceImpl implements InterfaceService{
    private DaoInterface dao;
    @Override
    public double calculate() {
        return dao.getData() * 11.5;
    }

    public void setDao(DaoInterface dao) {
        this.dao = dao;
    }
}

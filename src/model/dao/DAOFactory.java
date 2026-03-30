package model.dao;

import model.impl.SellerDaoJDBC;

public class DAOFactory {


    public  static  SellerDao createSellerDao(){
        return  new SellerDaoJDBC() ;
        }

}

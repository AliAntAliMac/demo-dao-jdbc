package application;

import model.dao.DAOFactory;
import model.dao.SellerDao;
import model.entinties.Department;
import model.entinties.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

//        Department obj = new Department(1, "books");
//
//        Seller seller = new Seller(21,"bob","bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DAOFactory.createSellerDao();
        System.out.println("=====teste 1: findByID++++");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}

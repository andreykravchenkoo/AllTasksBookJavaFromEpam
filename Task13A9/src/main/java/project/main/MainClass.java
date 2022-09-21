package project.main;

import project.connector.ConnectionCreator;
import project.dao.ManufacturerDAO;
import project.dao.WatchDAO;
import project.entity.Manufacturer;
import project.entity.Watch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
        List<Manufacturer> manufacturerList = manufacturerDAO.findManufacturerByAmountWatch(200);
        System.out.println(manufacturerList);

        WatchDAO watchDAO = new WatchDAO();
        int allPrice = watchDAO.findAllPrice();
        System.out.println(allPrice);

        boolean flag = watchDAO.transactionTest(new Watch(15, "dsfs", "rewrwer", 2, 2, 2), new Watch(16, "dsfs", "rewrwer", 22, 2, 2));
        System.out.println(flag);
    }
}

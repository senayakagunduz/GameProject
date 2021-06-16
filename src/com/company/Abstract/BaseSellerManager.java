package com.company.Abstract;

import com.company.Entities.Customer;
import com.company.Entities.Games;

public abstract class BaseSellerManager implements SellerService {
    @Override
    public void sell(Games games, Customer customer){
        System.out.println(games.getGameName()+ " oyunu " + customer.getFirstName()+ " tarafından " + games.getPrice() + " fiyatına alındı");

    }
}

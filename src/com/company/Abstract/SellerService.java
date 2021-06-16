package com.company.Abstract;

import com.company.Entities.Customer;
import com.company.Entities.Games;

public interface SellerService {
    void sell(Customer customer, Games games);

    void sell(Games games, Customer customer);
}

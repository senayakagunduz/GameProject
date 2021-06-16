package com.company.Concrate;

import com.company.Abstract.BaseSellerManager;
import com.company.Adaptors.SellerServiceAdapters;
import com.company.Entities.Customer;
import com.company.Entities.Games;

public class SellerCustomerManager extends BaseSellerManager {
    SellerServiceAdapters sellerServiceAdapters;

    public SellerCustomerManager(SellerServiceAdapters sellerServiceAdapters) {
        this.sellerServiceAdapters = sellerServiceAdapters;
    }
    @Override
    public void sell(Customer customer, Games games) {
        super.sell(games, customer);
    }
}

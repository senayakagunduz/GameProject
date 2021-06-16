package com.company.Adaptors;

import com.company.Abstract.SellerDiscountService;
import com.company.Abstract.SellerService;
import com.company.Entities.Customer;
import com.company.Entities.Games;

public class SellerServiceAdapters implements SellerDiscountService {

    @Override
    public double discountedPrice(Games games) {
        return games.getPrice()-(games.getPrice()* games.getDiscount())/100;
    }

    @Override
    public double discountedPrice() {
        return 0;
    }
}

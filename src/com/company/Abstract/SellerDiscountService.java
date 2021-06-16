package com.company.Abstract;

import com.company.Entities.Games;

public interface SellerDiscountService {
    double discountedPrice(Games games);

    double discountedPrice();
}

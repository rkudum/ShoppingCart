package com.hmrc.test.shoppingcart;

import java.util.Optional;

/**
 * Created by ramesh on 3/14/2017.
 */
public  enum Products {

    APPLE(0.60), ORANGE(0.25);

    private double price;

    Products(final double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

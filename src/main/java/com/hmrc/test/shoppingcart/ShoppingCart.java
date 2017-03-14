package com.hmrc.test.shoppingcart;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ramesh on 3/14/2017.
 */
public class ShoppingCart {

    public BigDecimal checkout(List<String> items) {
        long numberOfApples = items.stream().filter(s ->s.equalsIgnoreCase(Products.APPLE.name())).count();
        long numberOfOranges = items.stream().filter(s ->s.equalsIgnoreCase(Products.ORANGE.name())).count();
        return new BigDecimal((numberOfApples*Products.APPLE.getPrice())+(numberOfOranges*Products.ORANGE.getPrice())).setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}

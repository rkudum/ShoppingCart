package com.hmrc.test.shoppingcart;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ramesh on 3/14/2017.
 */
public class ShoppingCart {

    public BigDecimal checkout(List<String> items) {
        long numberOfApples = items.stream().filter(s ->s.equals("Apple")).count();
        long numberOfOranges = items.stream().filter(s ->s.equals("Orange")).count();
        return new BigDecimal((numberOfApples*0.60)+(numberOfOranges*0.25)).setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}

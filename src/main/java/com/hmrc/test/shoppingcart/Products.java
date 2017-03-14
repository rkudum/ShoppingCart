package com.hmrc.test.shoppingcart;

import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/**
 * Created by ramesh on 3/14/2017.
 */
public  enum Products implements LongFunction<Long> {

   APPLE(0.60) {
       @Override
       public Long apply(long totalNo) {
           //Buy One get One Free
           long itemNotInOffer = totalNo % 2;
           long offerBatch = totalNo / 2;
           return itemNotInOffer + offerBatch;
       }

    },
    ORANGE(0.25){
        @Override
        public Long apply(long totalNo) {
            // 3 for the price of 2
            long itemNotInOffer = totalNo % 3;
            long offerBatch = totalNo / 3;
            long offerBatchCount = offerBatch * 2;
            return offerBatchCount + itemNotInOffer;
        }
    };

    private double price;

    Products(final double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

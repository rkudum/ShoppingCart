package com.hmrc.test.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ramesh on 3/14/2017.
 */
public class ShoppingCartTest {

    ShoppingCart shoppingCartObj;

    @Before
    public void setUp() throws Exception {
        shoppingCartObj = new ShoppingCart();
    }

    @Test
    public void testOneIteminCartApples(){
            List<String> items = new ArrayList<>();
            items.add("Apple");
            assertEquals(shoppingCartObj.checkout(items),new BigDecimal(0.60).setScale(2,BigDecimal.ROUND_UP));
    }

    @Test
    public void testTwoIteminCartApples(){
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Apple");
        assertEquals(shoppingCartObj.checkout(items),new BigDecimal(1.20).setScale(2,BigDecimal.ROUND_UP));
    }

    @Test
    public void testThreeIteminCartApples(){
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Apple");
        items.add("Apple");
        assertEquals(shoppingCartObj.checkout(items),new BigDecimal(1.80).setScale(2,BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testOneIteminCartOrange(){
        List<String> items = new ArrayList<>();
        items.add("Orange");
        assertEquals(shoppingCartObj.checkout(items),new BigDecimal(0.25).setScale(2,BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testBothAppleAndOrangeInCart(){
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Apple");
        items.add("Orange");
        items.add("Apple");
        assertEquals(shoppingCartObj.checkout(items),new BigDecimal(2.05).setScale(2,BigDecimal.ROUND_HALF_UP));
    }

}

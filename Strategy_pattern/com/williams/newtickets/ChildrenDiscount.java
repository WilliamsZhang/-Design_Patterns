package com.williams.newtickets;

/**
 * 儿童票
 *
 * @auther williams
 * @create-time 2018-08-05-下午9:03
 */


public class ChildrenDiscount implements Discount{

    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        price = price - 10;
        return price;
    }
}

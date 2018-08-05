package com.williams.newtickets;

/**
 * Vip票
 *
 * @auther williams
 * @create-time 2018-08-05-下午9:05
 */


public class VipDiscount implements Discount{

    @Override
    public double calculate(double price) {
        System.out.println("Vip票");
        price = price*0.5;
        return price;
    }
}

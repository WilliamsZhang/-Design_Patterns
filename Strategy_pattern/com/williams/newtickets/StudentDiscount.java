package com.williams.newtickets;

/**
 * 学生折扣
 *
 * @auther williams
 * @create-time 2018-08-05-下午9:00
 */


public class StudentDiscount implements Discount{

    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        price = price * 0.8;
        return price;
    }
}

package com.williams.newtickets;

/**
 * Context
 *
 * @auther williams
 * @create-time 2018-08-05-下午9:07
 */


public class MovieTicket {
    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double calculatePrice(double price){
        return this.discount.calculate(price);

    }
}

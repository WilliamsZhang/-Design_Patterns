package com.williams.newtickets;

/**
 * @auther williams
 * @create-time 2018-08-05-下午9:12
 */


public class Test {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setDiscount(new StudentDiscount());
        double price = movieTicket.calculatePrice(30);
        System.out.println(price);
    }
}

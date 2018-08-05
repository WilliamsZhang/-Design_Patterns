package com.williams.ticket;

/**
 * @auther williams
 * @create-time 2018-08-05-下午8:22
 */


public class Test {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(80,"students");

        double price = movieTicket.calculatePrice();
        System.out.println(price);

    }
}

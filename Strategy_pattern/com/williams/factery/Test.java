package com.williams.factery;

/**
 * @auther williams
 * @create-time 2018-08-11-上午11:25
 */


public class Test {
    public static void main(String[] args) {
        Coffee coffee = factory.introductCoffee("mochacoffee");
        coffee.name();
        coffee.taste();
    }
}

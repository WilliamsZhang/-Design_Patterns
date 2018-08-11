package com.williams.factery;

/**
 * @auther williams
 * @create-time 2018-08-11-上午11:01
 */


public class factory {
    public static Coffee introductCoffee(String type){
        Coffee coffee = null;
        if(type.equalsIgnoreCase("lattecoffee")){
            coffee = new LatteCoffee();
        }
        else if(type.equalsIgnoreCase("mochacoffee")){
            coffee = new MochaCoffee();
        }
        return coffee;
    }
}

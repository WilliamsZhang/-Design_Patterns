package com.williams.factery;

/**
 * @auther williams
 * @create-time 2018-08-11-上午10:57
 */


public class LatteCoffee implements Coffee{

    public LatteCoffee() {
    }

    @Override
    public void taste() {
        System.out.println("美味香浓");
    }

    @Override
    public void name(){
        System.out.println("这杯拿铁咖啡");
    }

}

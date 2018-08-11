package com.williams.factery;

import java.sql.SQLOutput;

/**
 * @auther williams
 * @create-time 2018-08-11-上午11:00
 */


public class MochaCoffee implements Coffee {

    public MochaCoffee() {
    }

    @Override
    public void taste() {
        System.out.println("纯正厚黑");
    }

    @Override
    public void name(){
        System.out.println("这杯摩卡咖啡");
    }

}

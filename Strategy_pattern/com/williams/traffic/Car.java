package com.williams.traffic;

/**
 * 私家车
 *
 * @auther williams
 * @create-time 2018-08-05-下午4:59
 */


public class Car implements Vehicle {

    @Override
    public void arrival() {
        System.out.println("我开车去");
    }
}

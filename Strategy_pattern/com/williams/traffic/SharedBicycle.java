package com.williams.traffic;

/**
 * 共享单车
 * @auther williams
 * @create-time 2018-08-05-下午4:56
 */


public class SharedBicycle implements Vehicle{
    @Override
    public void arrival() {
        System.out.println("我骑共享单车去");;
    }
}

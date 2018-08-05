package com.williams.traffic;

/**
 * 策略模式
 * @auther williams
 * @create-time 2018-08-05-下午5:00
 */


public class Travel {
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void advent(){
        vehicle.arrival();
    }
}

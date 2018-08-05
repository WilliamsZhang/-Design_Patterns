package com.williams.ticket;

/**
 * @auther williams
 * @create-time 2018-08-05-下午8:10
 */


public class MovieTicket {
    private double price;
    private String type;

    public MovieTicket() {
    }

    public MovieTicket(double price, String type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calculatePrice(){
        if("students".equals(type)){
            System.out.println("学生票");
            price = price*0.8;

        }

        if("children".equals(type) && price>=20){
            System.out.println("儿童票");
            price = price-10;

        }

        if("vip".equals(type)){
            System.out.println("vip,增加积分！");
            price = price*0.5;

        }
        return price;

    }

}

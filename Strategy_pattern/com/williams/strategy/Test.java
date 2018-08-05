package com.williams.strategy;

/**
 * 主函数
 * @auther williams
 * @create-time 2018-08-05-上午10:35
 */

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result =calculator.add(1,2);
        System.out.println(result);
    }
}

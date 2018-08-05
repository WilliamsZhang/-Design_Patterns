package com.williams.newstrategy;

/**
 * @auther williams
 * @create-time 2018-08-05-下午1:45
 */


public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new OperationSubtract());
        int result = calculator.doOperation(3,4);
        System.out.println(result);
    }
}

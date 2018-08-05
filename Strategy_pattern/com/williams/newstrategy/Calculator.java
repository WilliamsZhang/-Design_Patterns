package com.williams.newstrategy;

/**
 * 策略模式
 * @auther williams
 * @create-time 2018-08-05-下午1:46
 */


public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int a, int b){
        return operation.doOperation(a,b);

    }
}

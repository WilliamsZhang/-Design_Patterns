package com.williams.newstrategy;

/**
 * @auther williams
 * @create-time 2018-08-05-下午1:43
 */


public class OperationAdd implements Operation{
    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}

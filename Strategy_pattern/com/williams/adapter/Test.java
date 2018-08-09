package com.williams.adapter;

/**
 * @auther williams
 * @create-time 2018-08-09-下午2:14
 */


public class Test {
    public static void main(String[] args){
        ReaderPlay readerPlay = new Adapter();
        readerPlay.read("txt","123.txt");
    }
}

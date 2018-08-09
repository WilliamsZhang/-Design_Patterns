package com.williams.adapter;

/**
 * @auther williams
 * @create-time 2018-08-09-上午11:51
 */


public class BookPlay{
    public void readtxt(String filename){
        System.out.println("这是一个txt文件格式的电子书"+filename);
    }

    public void readepub(String filename){
        System.out.println("这是一个epub文件格式的电子书"+filename);
    }
}
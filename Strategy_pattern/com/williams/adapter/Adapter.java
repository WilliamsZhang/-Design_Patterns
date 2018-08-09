package com.williams.adapter;

/**
 * @auther williams
 * @create-time 2018-08-09-上午11:56
 */


public class Adapter extends ReaderPlay{
    private BookPlay bookPlay;

    public Adapter(){
        bookPlay = new BookPlay();
    }

    @Override
    public void read(String type,String filename){
    	if("txt".equals(type)){
            bookPlay.readtxt(filename);
    	}

    	else if("epub".equals(type)){
            bookPlay.readepub(filename);
    	}
    }
}
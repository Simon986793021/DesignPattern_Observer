package com.wind.designpattern_observer;

import java.util.Observable;

/**
 * Created by zhangcong on 2018/3/16.
 */

public class ConcreteObserver implements Observer{
    private String name;
    java.util.Observer
    public ConcreteObserver (String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void supportAmry() {
        System.out.println(name+"前来支援");
    }

    @Override
    public void beAttached(AmryControlCenter amryControlCenter) {
        System.out.println(name+"受到了攻击，请求支援");
        amryControlCenter.notifyAll(name);
    }
}

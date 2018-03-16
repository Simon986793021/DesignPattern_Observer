package com.wind.designpattern_observer;

import java.util.ArrayList;

/**
 * Created by zhangcong on 2018/3/16.
 */

public abstract class AmryControlCenter {
    ArrayList<Observer> arrayList=new ArrayList<>();
    public void addAmry(Observer observer){
        arrayList.add(observer);
        System.out.println(observer.getName()+"加入战队");
    }
    public void quitAmry(Observer observer){
        arrayList.remove(observer);
        System.out.println(observer.getName()+"退出战队");
    }
    public abstract void notifyAll(String name);
}

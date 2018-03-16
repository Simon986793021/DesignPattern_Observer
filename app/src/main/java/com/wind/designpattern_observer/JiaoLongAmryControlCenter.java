package com.wind.designpattern_observer;

/**
 * Created by zhangcong on 2018/3/16.
 */

public class JiaoLongAmryControlCenter extends AmryControlCenter {
    private String armyName;
    public JiaoLongAmryControlCenter(String name){
        armyName=name;
        System.out.println(name+"战队组建成功");
    }
    @Override
    public void notifyAll(String name) {
        for (Observer observer:arrayList){
            if (!observer.getName().equalsIgnoreCase(name)){
                observer.supportAmry();
            }
        }
    }
}

package com.wind.designpattern_observer;

/**
 * Created by zhangcong on 2018/3/16.
 */

public interface Observer {
    public String getName();
    public void supportAmry();
    public void beAttached(AmryControlCenter amryControlCenter);
}

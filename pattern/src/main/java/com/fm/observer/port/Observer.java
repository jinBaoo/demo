package com.fm.observer.port;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public interface Observer {
    public void update(Float temp,Float humidity,Float pressure);
}

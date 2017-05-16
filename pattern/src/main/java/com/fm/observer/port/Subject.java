package com.fm.observer.port;


/**
 * Created by Administrator on 2017/4/14 0014.
 */
public interface Subject {
    public void regObserver(Observer observer) ;

    public void remObserver(Observer observer);

    public void notifyObserver();

}

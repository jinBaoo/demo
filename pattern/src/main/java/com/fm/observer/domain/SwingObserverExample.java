package com.fm.observer.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
public class SwingObserverExample {

    JFrame jFrame;


    public static void main(String[] args) {
        SwingObserverExample sw = new SwingObserverExample();
        sw.go();
    }

    public  void go() {
        jFrame = new JFrame();
        JButton button = new JButton("should i do it ?");
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER,button);
    }


    class AngleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it !!!");
        }
    }
    class  DevilListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(" com on ! do it ");
        }
    }
}

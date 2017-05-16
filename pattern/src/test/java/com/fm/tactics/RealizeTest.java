package com.fm.tactics;

import com.fm.tactics.entity.Duck;
import com.fm.tactics.expand.FlyRocketPowered;
import com.fm.tactics.expand.MallardDuck;
import com.fm.tactics.expand.ModelDuck;
import org.junit.Test;

/**
 * Created by Administrator on 2017/4/13 0013.
 */
public class RealizeTest {

    @Test
    public void test01 () {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        System.out.println("-------------------------------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    @Test
    public void test02(){
        save(1);
    }
    public void save(final Integer a) {
        System.out.println(a);
    }
}

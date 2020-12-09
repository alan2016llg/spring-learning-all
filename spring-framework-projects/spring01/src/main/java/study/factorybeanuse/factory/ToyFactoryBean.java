package study.factorybeanuse.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import study.factorybeanuse.bean.Ball;
import study.factorybeanuse.bean.Car;
import study.factorybeanuse.bean.Child;
import study.factorybeanuse.bean.Toy;

/**
 * @Author: liulg
 * @Date: 2020/10/9 10:44
 * 构造一个玩具工厂
 */
@Component
public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null
                // 之前的1.x版本是不允许的
                return null;
        }
    }

    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }


    public ToyFactoryBean() {
        this.child=new Child();
        System.out.println("ToyFactoryBean 初始化了。。。");
    }
}

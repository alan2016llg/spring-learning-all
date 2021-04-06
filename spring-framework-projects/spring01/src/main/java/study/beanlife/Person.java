package study.beanlife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: liulg
 * @Date: 2020/12/14 21:47
 */
public class Person implements InitializingBean, DisposableBean, Lifecycle {
    private String name;

    private boolean state = false;

    public Person() {
        System.out.println("Person constructor run ......");
    }

    public void initMethod() {
        System.out.println("Person initMethod run ......");
    }

    public void destroyMethod() {
        System.out.println("Person destroyMethod run ......");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Person @PostConstruct run ......");
    }

    @PreDestroy
    public void preDestory() {
        System.out.println("Person @PreDestroy run ......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Person DisposableBean run ......");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person InitializingBean run ......");
    }


    @Override
    public void start() {
        System.out.println("Person 睡醒起床了 ......");
        this.state = true;
    }

    @Override
    public void stop() {
        System.out.println("Person 睡觉去了 ......");
        this.state = false;
    }

    @Override
    public boolean isRunning() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}

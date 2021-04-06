package study.a_initmethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: liulg
 * @Date: 2020/10/9 14:13
 */


public class Pen3 implements InitializingBean, DisposableBean {
    private Integer ink;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("钢笔中已加满墨水2。。。");
        this.ink = 100;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("钢笔中的墨水都放干净了2。。。");
        this.ink = 0;
    }

    public void initb() {
        System.out.println("被初始化了。。。");
    }

    public void destroyb() {
        System.out.println("被销毁了。。。");
    }

    @PostConstruct
    public void addInk() {
        System.out.println("钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}

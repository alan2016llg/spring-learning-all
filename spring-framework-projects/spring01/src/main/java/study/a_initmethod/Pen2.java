package study.a_initmethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/10/9 14:13
 */
@Component
public class Pen2 implements InitializingBean, DisposableBean {
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

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}

package study.a_initmethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: liulg
 * @Date: 2021/4/6 14:25
 */
public class Pen4 {
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("pen4被销毁了。。。");
    }
}

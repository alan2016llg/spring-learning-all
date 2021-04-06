package study.destory;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @Author: liulg
 * @Date: 2020/10/20 16:18
 */
@Component
public class TermainBean {

    @PreDestroy
    public void preDestroy() {
        System.out.println("销毁");
    }

}

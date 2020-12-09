package study.di.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/9/27 1:01
 */
@Component
public class Black {

    @Value("yep!!")
    String name;

    public String getName() {
        return name;
    }
}

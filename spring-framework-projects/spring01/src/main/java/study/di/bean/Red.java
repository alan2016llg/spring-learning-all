package study.di.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/9/27 1:09
 */
@Component
public class Red {

    @Value("${red.name}")
    private String name;
    @Value("${red.order}")
    private String order;

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}

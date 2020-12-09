package study.di.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/9/27 1:09
 * SpEL属性注入
 */
@Component
public class Blue {

    @Value("${blue.name}")
    private String name;
    @Value("#{2}")
    private String order;

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Blue{" +
                "name='" + name + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}

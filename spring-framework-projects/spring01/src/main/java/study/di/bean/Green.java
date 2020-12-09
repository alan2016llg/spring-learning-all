package study.di.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/9/27 1:31
 */
@Component
public class Green {
    @Value("#{'copy of ' + blue.name.substring(0,3)}")
    private String name;

    @Value("#{blue.order + 1}")
    private Integer order;

    @Override
    public String toString() {
        return "Green{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}

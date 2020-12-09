package study.factoryprocessor;

import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/12/7 14:57
 */
@Component
public class Red extends Color {


    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
package study.factoryprocessor;

import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/12/7 14:58
 */
@Component
public class Green extends Color {

    @Override
    public String toString() {
        return "Green{" + "name='" + name + '\'' + "}";
    }
}

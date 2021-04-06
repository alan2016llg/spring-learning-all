package study.di.fixdi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/9/28 14:42
 */
@Component
public class People {


    @Autowired
    @Qualifier("adog")
    private Dog dog;


    public Dog getDog() {
        return dog;
    }
}

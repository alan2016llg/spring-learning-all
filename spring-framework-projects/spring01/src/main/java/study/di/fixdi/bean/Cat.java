package study.di.fixdi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: liulg
 * @Date: 2020/9/30 9:20
 */
@Component
public class Cat {


    @Resource(name = "dog")
    private Dog dog;

    public Dog getDog() {
        return dog;
    }


    public void setDog(Dog dog) {
        this.dog = dog;
    }


    public Cat(Dog dog) {
        this.dog = dog;
    }
}

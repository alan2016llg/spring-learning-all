package study.i_lazyinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.i_lazyinject.bean.Dog;
import study.i_lazyinject.bean.Person;

/**
 * @Author: liulg
 * @Date: 2020/10/9 10:00
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext("study.i_lazyinject.bean");

        Dog dog  = (Dog) context.getBean("dog");
        System.out.println(dog.getPerson());
    }
}

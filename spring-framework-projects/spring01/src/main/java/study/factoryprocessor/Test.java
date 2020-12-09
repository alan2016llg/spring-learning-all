package study.factoryprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/12/7 15:07
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context  = new AnnotationConfigApplicationContext("study.factoryprocessor");
        Red red = context.getBean(Red.class);
       System.out.println(red);

    }
}

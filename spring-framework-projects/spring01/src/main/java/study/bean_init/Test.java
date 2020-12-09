package study.bean_init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/11/16 16:41
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("study.bean_init");
        Cap cap = context.getBean(Cap.class);
        System.out.println(cap);
    }
}

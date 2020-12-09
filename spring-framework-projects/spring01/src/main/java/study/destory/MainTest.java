package study.destory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/10/20 16:19
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context  =new AnnotationConfigApplicationContext("study.destory");
        ((AnnotationConfigApplicationContext) context).close();
    }
}

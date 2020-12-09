package study.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2020/10/14 10:58
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("study.event");
        System.out.println("容器初始化完成");
        ((AnnotationConfigApplicationContext) context).close();
        System.out.println("容器关闭");
    }
}

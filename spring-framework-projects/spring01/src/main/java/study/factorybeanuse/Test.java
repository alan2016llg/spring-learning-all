package study.factorybeanuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.factorybeanuse.bean.Toy;

/**
 * @Author: liulg
 * @Date: 2020/10/9 10:49
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("study.factorybeanuse");
        Toy bean  = (Toy) context.getBean("toyFactoryBean");
        System.out.println(bean);

    }
}

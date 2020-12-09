package study.di.fixdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.di.fixdi.bean.Cat;
import study.di.fixdi.bean.People;
import study.di.fixdi.config.Config;

/**
 * @Author: liulg
 * @Date: 2020/9/28 14:40
 */
public class FixTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        /*People bean = context.getBean(People.class);
        System.out.println(bean.getDog().getName());*/

        // @Autowired方式注入，可以直接加在变量上，构造器上，set上
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat.getDog().getName());


    }
}

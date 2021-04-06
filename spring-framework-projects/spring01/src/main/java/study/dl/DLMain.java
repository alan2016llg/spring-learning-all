package study.dl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.dl.bean.Persion;

/**
 * @Author: liulg
 * @Date: 2020/9/18 14:56
 * <p>
 * 依赖查找
 */
public class DLMain {
    public static void main(String[] args) throws Exception {
        //基于bean的id
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart_byname.xml");
        Persion persion = (Persion) factory.getBean("persion");
        System.out.println(persion);

        //基于类名
        BeanFactory factory2 = new ClassPathXmlApplicationContext("basic_dl/quickstart_byname2.xml");
        Persion persion1 = (Persion) factory2.getBean(Persion.class);
        System.out.println(persion1);

    }
}

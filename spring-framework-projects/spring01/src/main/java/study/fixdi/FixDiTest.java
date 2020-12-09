package study.fixdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.fixdi.bean.Person;
import study.fixdi.bean.PersonAnno;

/**
 * @Author: liulg
 * @Date: 2020/9/30 16:44
 *
 */
public class FixDiTest {
    public static void main(String[] args) {

        //通过配置文件进行各种复杂属性的注入
        ApplicationContext context = new ClassPathXmlApplicationContext("fix_di/fix_di.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());

        //基于注解进行属性注入
        ApplicationContext anno = new AnnotationConfigApplicationContext("study.fixdi.bean");
        PersonAnno personAnno = (PersonAnno) anno.getBean("personAnno");
        System.out.println(personAnno.toString());
    }
}

package study.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;
import study.event.listener.ContextRefreshedEventListener;

/**
 * @Author: liulg
 * @Date: 2020/10/14 10:58
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("study.event");
        System.out.println("容器初始化完成");

        //它主要是能方便的取出类、对象、继承的抽象类、实现的接口等等，上面标注的泛型类型
        ResolvableType resolvableType = ResolvableType.forClass(ContextRefreshedEventListener.class);
        System.out.println(resolvableType.getInterfaces()[0].resolveGeneric(0));

        ((AnnotationConfigApplicationContext) context).close();
        System.out.println("容器关闭");

    }

}

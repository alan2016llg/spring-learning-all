package study.a_conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @Author: liulg
 * @Date: 2020/10/14 14:38
 * <p>
 * 观察在@EnableTavern注解中是否导入boss,决定了是否创建标注了@ConditionalOnBean的bean
 */
public class TavernTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(TavernConfiguration.class);
        ctx.refresh();
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    }
}

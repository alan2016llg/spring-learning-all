package study.programmatic;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.beans.Introspector;
import java.sql.SQLSyntaxErrorException;
import java.util.Set;

/**
 * @Author: liulg
 * @Date: 2020/12/7 21:53
 */
public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx);

        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
                .addPropertyValue("name", "老王").getBeanDefinition();
        ctx.registerBeanDefinition("laowang", personDefinition);

        scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> {
            // getClassMetadata可以获取到扫描类的相关元信息，此处把Animal的子类都拿出来
            return metadataReader.getClassMetadata().getSuperClassName().equals(Animal.class.getName());
        });
        Set<BeanDefinition> animalDefinitions = scanner
                .findCandidateComponents("study.programmatic");
        animalDefinitions.forEach(definition -> {
            MutablePropertyValues propertyValues = definition.getPropertyValues();
            String beanClassName = definition.getBeanClassName();
            propertyValues.addPropertyValue("name", beanClassName);
            // 设置依赖注入的引用，需要借助RuntimeBeanReference实现
            propertyValues.addPropertyValue("person", new RuntimeBeanReference("laowang"));
            ctx.registerBeanDefinition(Introspector.decapitalize(beanClassName.substring(beanClassName.lastIndexOf("."))), definition);
        });
        ctx.refresh();
        System.out.println(ctx.getBean(Cat.class));
        System.out.println(ctx.getBean(Dog.class));

    }
}

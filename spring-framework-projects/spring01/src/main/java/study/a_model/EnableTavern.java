package study.a_model;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2020/10/14 14:25
 * 声明一个酒馆注解，通过import导入老板类
 * 这个注解的作用：标注了@EnableTavern 注解，就会触发 @Import 的效果，向容器中导入一个 Boss 类型的 Bean 。
 */
@Documented  //说明该注解将被包含在javadoc中
@Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target(ElementType.TYPE)  ////接口、类、枚举
@Import(value = {Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}

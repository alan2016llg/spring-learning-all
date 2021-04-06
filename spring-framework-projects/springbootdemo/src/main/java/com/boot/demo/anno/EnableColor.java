package com.boot.demo.anno;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: liulg
 * @Date: 2021/3/30 15:40
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Red.class})
public @interface EnableColor {
}

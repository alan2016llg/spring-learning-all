package com.boot.demo.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2021/3/30 15:43
 * 组件装配
 */
public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfig.class);
        //Red bean = ctx.getBean(Red.class);
    }
}

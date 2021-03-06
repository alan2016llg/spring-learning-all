package com.demo.factory;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: liulg
 * @Date: 2020/9/18 11:13
 * <p>
 * IOC 控制反转，将类的创建交给BeanFactory实现
 * DL 依赖查找，通过传递BeanName去获取和创建对象的过程
 */
public class BeanFactory {

    private static Properties properties;
    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();

    static {
        try {
            properties = new Properties();
            // 必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            // BeanFactory类的静态初始化都失败了，那后续也没有必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        // 双检锁保证beanMap中确实没有beanName对应的对象
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    // 过了双检锁，证明确实没有，可以执行反射创建
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        // 反射创建后放入缓存再返回
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}

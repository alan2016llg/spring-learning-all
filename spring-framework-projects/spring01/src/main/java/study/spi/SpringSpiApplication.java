package study.spi;

import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * @Author: liulg
 * @Date: 2020/12/8 16:02
 */
public class SpringSpiApplication {
    public static void main(String[] args) {
        // 加载并实例化
        List<DemoDao> demoDaos = SpringFactoriesLoader
                .loadFactories(DemoDao.class, SpringSpiApplication.class.getClassLoader());
        demoDaos.forEach(dao -> {
            System.out.println(dao);
        });
        System.out.println("------------------------------------------------");
        // 只加载全限定类名
        List<String> daoClassNames = SpringFactoriesLoader
                .loadFactoryNames(DemoDao.class, SpringSpiApplication.class.getClassLoader());
        daoClassNames.forEach(className -> {
            System.out.println(className);
        });
    }
}

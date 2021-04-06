package study.spi;

import java.util.ServiceLoader;

/**
 * @Author: liulg
 * @Date: 2020/12/8 15:43
 */
public class JdkSpiApplication {
    public static void main(String[] args) {
        ServiceLoader<DemoDao> loader = ServiceLoader.load(DemoDao.class);
        loader.iterator().forEachRemaining(dao -> {
            System.out.println(dao);
        });
    }
}

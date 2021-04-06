package dao.test3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: liulg
 * @Date: 2021/3/29 21:04
 *
 * 事物的事件回调、、事物执行成功后或事物执行前执行某些操作
 */
public class TestClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        ServiceImpl bean = ctx.getBean(ServiceImpl.class);
        bean.getUser();
    }
}

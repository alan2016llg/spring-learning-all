package aop.test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liulg
 * @Date: 2021/3/17 9:26
 * <p>
 * 定义一个陪玩平台
 */
public class PartnerPlatform {
    private static List<IndividualPartner> partners = new ArrayList<>();

    static {
        partners.add(new IndividualPartner("肖洁洁"));
        partners.add(new IndividualPartner("田苟"));
        partners.add(new IndividualPartner("高总裁"));
    }


    //动态代理
    public static PartnerIfce getPartner(int money) {
        PartnerIfce partner = partners.remove(0);
        //jdk的动态代理、对原始对象进行代理增强
        return (PartnerIfce) Proxy.newProxyInstance(partner.getClass().getClassLoader(), partner.getClass().getInterfaces(), new InvocationHandler() {
            private int budget = money;
            private boolean status = false;

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("exec :" + method.getName() + ",obj:" + proxy.getClass());
                if (method.getName().equals("receiveMoney")) {
                    int money = (int) args[0];
                    // 平台需要运营，抽成一半
                    args[0] = money / 2;
                    // 如果在付钱时没给够，则标记budget为异常值
                    this.status = money >= budget;
                }
                if (status) {
                    return method.invoke(partner, args);
                }
                return null;
            }
        });
    }
}

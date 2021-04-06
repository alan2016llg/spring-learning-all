package aop.test2;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liulg
 * @Date: 2021/3/17 9:26
 * <p>
 * 定义一个陪玩平台
 */
public class PartnerPlatform {
    private static List<Partner> partners = new ArrayList<>();

    static {
        partners.add(new Partner("肖洁洁"));
        partners.add(new Partner("田苟"));
        partners.add(new Partner("高总裁"));
    }


    //cglib动态代理
    public static Partner getPartner(int money) {
        Partner partner = partners.remove(0);
        return (Partner) Enhancer.create(partner.getClass(), new MethodInterceptor() {
            private int budget = money;
            private boolean status = false;

            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("exec :" + method.getName() + ",obj:" + o.getClass());
                // 如果在付钱时没给够，则标记budget为异常值
                if (method.getName().equals("receiveMoney")) {
                    int money = (int) args[0];
                    args[0] = money / 2;
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

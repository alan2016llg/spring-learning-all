package aop.test1;

/**
 * @Author: liulg
 * @Date: 2021/3/17 9:24
 * <p>
 * jdk动态代理
 */
public class Client {

    public static void main(String[] args) {
        Player player = new Player("郝武辽");
        //设置金额阀值
        PartnerIfce partner = PartnerPlatform.getPartner(50);
        //已经是代理的对象了
        System.out.println(partner.getClass());
        //每一次调用都会进行invoke方法的调用
        partner.receiveMoney(200);
        partner.playWith(player);
    }
}

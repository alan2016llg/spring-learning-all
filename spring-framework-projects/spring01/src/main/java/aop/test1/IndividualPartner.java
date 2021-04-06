package aop.test1;

/**
 * @Author: liulg
 * @Date: 2021/3/17 9:21
 * <p>
 * 定义一个陪玩对象
 */
public class IndividualPartner implements PartnerIfce {
    private String name;

    public IndividualPartner(String name) {
        this.name = name;
    }

    /**
     * 收钱
     *
     * @param money
     */
    @Override
    public void receiveMoney(int money) {
        System.out.println(name + "收到佣金：" + money + "元 ~ ");
    }

    /**
     * 陪玩
     *
     * @param player
     */
    @Override
    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起愉快地玩耍 ~ ");
    }

}

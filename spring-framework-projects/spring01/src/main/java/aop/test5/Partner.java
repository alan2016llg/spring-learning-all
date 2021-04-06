package aop.test5;

import aop.test1.Player;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2021/3/17 10:22
 */
@Component
public class Partner {
    private String name;

    public Partner() {
    }

    public Partner(String name) {
        this.name = name;
    }

    /**
     * 收钱
     *
     * @param money
     */
    @Log
    public void receiveMoney(int money) {
        ((Partner) AopContext.currentProxy()).playWith(new Player("lisi"));
        System.out.println(name + "收到佣金：" + money + "元 ~ ");
    }

    /**
     * 陪玩
     *
     * @param player
     */
    @Log
    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起愉快地玩耍 ~ ");
    }
}

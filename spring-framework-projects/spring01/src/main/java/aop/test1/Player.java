package aop.test1;

/**
 * @Author: liulg
 * @Date: 2021/3/17 9:17
 * <p>
 * 定义一个玩家
 */
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

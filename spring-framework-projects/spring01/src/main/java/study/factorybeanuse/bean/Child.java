package study.factorybeanuse.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/10/9 10:39
 */

public class Child {

    private String wantToy = "car";//生效的玩具种类

    public String getWantToy() {
        return wantToy;
    }

    public Child() {
        System.out.println("实例化child");
    }
}

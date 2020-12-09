package study.a_profile;

import org.springframework.context.annotation.Profile;

/**
 * @Author: liulg
 * @Date: 2020/10/14 14:42
 */

public class Bartender {
    private String name;

    public Bartender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

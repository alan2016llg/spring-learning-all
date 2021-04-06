package study.di.bean;

/**
 * @Author: liulg
 * @Date: 2020/9/27 0:53
 */
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

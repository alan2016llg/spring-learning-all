package study.a_initmethod;

/**
 * @Author: liulg
 * @Date: 2020/10/9 11:41
 */
public class Cat {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println(name + "被初始化了。。。");
    }

    public void destroy() {
        System.out.println(name + "被销毁了。。。");
    }
}

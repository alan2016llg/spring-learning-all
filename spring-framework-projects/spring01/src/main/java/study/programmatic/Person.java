package study.programmatic;

/**
 * @Author: liulg
 * @Date: 2020/12/7 17:21
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

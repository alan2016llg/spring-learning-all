package study.di.bean;

/**
 * @Author: liulg
 * @Date: 2020/9/18 15:20
 */
public class Cat {
    private String name;
    private String kind;
    private Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", person=" + person +
                '}';
    }
}

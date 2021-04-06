package study.programmatic;

/**
 * @Author: liulg
 * @Date: 2020/12/7 21:23
 */
public abstract class Animal {
    protected String name;

    protected Person person;

    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }

    public Animal() {
        System.out.println("Animal constructor run ......");
    }
}

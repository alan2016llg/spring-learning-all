package study.factoryprocessor;

/**
 * @Author: liulg
 * @Date: 2020/12/7 14:57
 */
public abstract  class Color {
    protected String name;
    String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

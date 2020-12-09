package study.fixdi.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author: liulg
 * @Date: 2020/9/30 9:54
 */

@Component
public class PersonAnno {

    @Value("#new String[]{'123',456}")
    private String[] names;
    @Value("#{{'a','b','c'}}")
    private List<String> tels;
    @Value("#{{@catAno,new study.fixdi.bean.Cat()}}")
    private Set<Cat> cats;
    @Value("#{{'apple':'apple','banana':'banana'}}")
    private Map<String, Object> events;
    @Value("#{{'apple1':'apple1','banana1':'banana1'}}")
    private Properties props;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", props=" + props +
                '}';
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getTels() {
        return tels;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public Set<Cat> getCats() {
        return cats;
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }

    public Map<String, Object> getEvents() {
        return events;
    }

    public void setEvents(Map<String, Object> events) {
        this.events = events;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}

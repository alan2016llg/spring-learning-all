package study.i_lazyinject.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/10/9 9:55
 * ObjectProvider:实现延迟注入bean
 */
@Component
public class Dog {

    private Person person;

    @Autowired
    public void setPerson(ObjectProvider<Person> person) {
        //有bean才取出注入
        this.person = person.getIfAvailable();
    }

    public Person getPerson() {
        return person;
    }
}

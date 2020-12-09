package study.bean_init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2020/11/16 16:38
 */
@Component
public class Cap  {
    @Value("66666")
    String name;
}

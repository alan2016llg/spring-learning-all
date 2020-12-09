package study.enablejdbcspi;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: liulg
 * @Date: 2020/12/8 16:11
 */
public class JdbcConfigSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> configClassNames = SpringFactoriesLoader
                .loadFactoryNames(EnableJdbc.class, this.getClass().getClassLoader());
        return configClassNames.toArray(new String[0]);
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}

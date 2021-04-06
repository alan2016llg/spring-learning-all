package aop.test3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: liulg
 * @Date: 2021/3/22 17:54
 */
@Aspect
@Component
public class Logger {

    @Before("execution(public * aop.test3.Partner.*(..))")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }

    @After("execution(public * aop.test3.Partner.*(..)))")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning("execution(public * aop.test3.Partner.*(..)))")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    @AfterThrowing("execution(public * aop.test3.Partner.*(..)))")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * aop.test3.Partner.*(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        return joinPoint.proceed(); // 此处会抛出Throwable异常
    }
}

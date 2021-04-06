package aop.test4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: liulg
 * @Date: 2021/3/22 17:54
 */
@Aspect
@Component
public class Logger {

    @Before("@annotation(aop.test4.Log)")
    public void beforePrint(JoinPoint joinPoint) {
        System.out.println("Logger beforePrint run ......");
        System.out.println("被拦截的类：" + joinPoint.getTarget().getClass().getName());
        System.out.println("被拦截的方法：" + ((MethodSignature) joinPoint.getSignature()).getMethod().getName());
        System.out.println("被拦截的方法参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Logger beforePrint run ......");
    }
   /* @After("execution(public * aop.test4.Partner.*(..)))")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning("execution(public * aop.test4.Partner.*(..)))")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    @AfterThrowing("execution(public * aop.test4.Partner.*(..)))")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * aop.test4.Partner.*(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        return joinPoint.proceed(); // 此处会抛出Throwable异常
    }*/
}

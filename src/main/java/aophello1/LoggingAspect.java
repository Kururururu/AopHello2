package aophello1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by user on 2017-05-17.
 */
@Aspect
public class LoggingAspect {
    @Around("execution(* aophello1.PrintMsg.sayHello1())")
    public void myAdvice(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("메소드 실행전 안녕...");
        Object ret = pjp.proceed();
        System.out.println("메소드 실행후 안녕..");
    }

}

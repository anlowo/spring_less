package com.example.spring_less.lesson8.configuration_aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspects {
    @Before("execution(public * get*(..))") // Это место point cut (срез) выражение // execution(public void адрес метода)
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public * returnBook())") // Это место point cut (срез) выражение
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }
}

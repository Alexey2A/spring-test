package org.example.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("org.example.aop.aspects.MyPointcuts.allMethodsFromFoodWarehouse()")
    public void productActionAdvice() {
        System.out.println("с продуктом на Продовольственном складе что-то происходит");
        System.out.println("----------------");
    }
}

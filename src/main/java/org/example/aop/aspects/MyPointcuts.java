package org.example.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class MyPointcuts {

    @Pointcut("execution(* org.example.aop.FoodWarehouse.*(..))")
    public void allMethodsFromFoodWarehouse() {
    }

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {
    }

}

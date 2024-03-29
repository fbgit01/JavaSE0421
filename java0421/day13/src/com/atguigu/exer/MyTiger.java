package com.atguigu.exer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTiger {

    String value() default "atguigu";

}

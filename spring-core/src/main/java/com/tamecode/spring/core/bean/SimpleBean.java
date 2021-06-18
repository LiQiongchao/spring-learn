package com.tamecode.spring.core.bean;

/**
 * @author Liqc
 * @date 2021/6/2 17:53
 */
public class SimpleBean {

    private static SimpleBean simpleBean = new SimpleBean();

    public void sayHello() {
        System.out.println("hello world.");
    }

    public static SimpleBean createInstance() {
        return simpleBean;
    }

    static class StaticSimpleBean{
        public void sayHello() {
            System.out.println("static hello world.");
        }
    }

}

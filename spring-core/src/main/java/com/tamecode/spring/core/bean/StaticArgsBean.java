package com.tamecode.spring.core.bean;

/**
 * @author Liqc
 * @date 2021/6/30 15:26
 */
public class StaticArgsBean {

    private String name;
    private int age;
    private String sex;

    private StaticArgsBean(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 创建对象的工厂方法
     *
     * @param name
     * @param age
     * @param sex
     * @return
     */
    public static StaticArgsBean createInstance(String name, int age, String sex) {
        return new StaticArgsBean(name, age, sex);
    }

}

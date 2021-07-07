package com.tamecode.spring.core.bean;

/**
 * @author Liqc
 * @date 2021/7/7 17:42
 */
public class Person {

    private String name;
    private Integer age;
    private Address address = new Address();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

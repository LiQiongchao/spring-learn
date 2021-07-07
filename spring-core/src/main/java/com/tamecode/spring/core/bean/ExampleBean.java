package com.tamecode.spring.core.bean;

import java.beans.ConstructorProperties;

public class ExampleBean {

    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean() {
    }

    /**
     * @ConstructorProperties 是用来指定参数的属性名的，当两个参数都为String时， 为了区分参数对应的属性名。
     * @param years
     * @param ultimateAnswer
     */
    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getUltimateAnswer() {
        return ultimateAnswer;
    }

    public void setUltimateAnswer(String ultimateAnswer) {
        this.ultimateAnswer = ultimateAnswer;
    }
}
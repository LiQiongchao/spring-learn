package com.tamecode.spring.core.bean;

/**
 * 使用 setter 注入
 * 使用 Setter 时，可以使用 @Required 来可以使该属性成为必需的依赖项。
 * 最好使用构造器注入，那样可以避免有的字段为空。
 */
public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on the MovieFinder
    private SimpleBean movieFinder;

    private String stringField;

    // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(SimpleBean movieFinder) {
        this.movieFinder = movieFinder;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    // business logic that actually uses the injected MovieFinder is omitted...
}
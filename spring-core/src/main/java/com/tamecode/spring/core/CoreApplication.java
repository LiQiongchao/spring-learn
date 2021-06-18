package com.tamecode.spring.core;

import com.tamecode.spring.core.bean.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liqc
 * @date 2021/6/2 17:50
 */
public class CoreApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml", "application-bean.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.registerShutdownHook();
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.sayHello();
        context.close();
    }

}

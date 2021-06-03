package com.tamecode.spring.core;

import com.tamecode.spring.core.bean.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liqc
 * @date 2021/6/2 17:50
 */
public class CoreApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        // 注册勾子，实现优雅关机（关闭系统时，不会出现数据不一致的问题）
        context.registerShutdownHook();
        context.getEnvironment().setActiveProfiles();
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.sayHello();
        context.close();
    }

}

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
        // 注册勾子，实现优雅关机（关闭系统时，不会出现数据不一致的问题）
        context.registerShutdownHook();
        context.getEnvironment().setActiveProfiles();
//        SimpleBean bean = context.getBean("simpleBean", SimpleBean.class);
        // 使用别名进行查找bean，本质上和simpleBean使用的是同一个对象。
        SimpleBean bean = context.getBean("simpleBean2", SimpleBean.class);
        bean.sayHello();
        Object staticSimpleBean = context.getBean("staticSimpleBean");
        System.out.println(staticSimpleBean);
        context.close();
    }

}

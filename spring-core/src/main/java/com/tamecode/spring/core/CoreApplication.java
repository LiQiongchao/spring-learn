package com.tamecode.spring.core;

import com.tamecode.spring.core.bean.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liqc
 * @date 2021/6/2 17:50
 */
public class CoreApplication {

    public static void main(String[] args) {
        // 不支持 xml 文件名大写，如果 xml 文件名中有大写，会无法解析文件。
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml", "application-bean.xml");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-${user.name}.xml");
        System.setProperty("spring", "classpath");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:application.xml");
        // 注册勾子，实现优雅关机（关闭系统时，不会出现数据不一致的问题）
        context.registerShutdownHook();
        context.getEnvironment().setActiveProfiles("dev");
//        SimpleBean bean = context.getBean("simpleBean", SimpleBean.class);
        // 使用别名进行查找bean，本质上和simpleBean使用的是同一个对象。
        SimpleBean bean = context.getBean("simpleBean2", SimpleBean.class);
        bean.sayHello();
        Object staticSimpleBean = context.getBean("staticSimpleBean");
        System.out.println(staticSimpleBean);
        context.close();
    }

}

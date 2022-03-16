package org.db.soft.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //加载配置文件信息
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "appliction.xml" );
        //获取bean对象
        Person person = (Person) applicationContext.getBean( "p" );
        person.sayHello();
    }
}

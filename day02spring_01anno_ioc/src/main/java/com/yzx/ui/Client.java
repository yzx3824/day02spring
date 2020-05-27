package com.yzx.ui;

import com.yzx.dao.IAccountDao;
import com.yzx.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @program: day01spring
 * @description: 模拟一个表现层，用于调用业务层
 * @author: yanzhixian
 * @create: 2020-05-20 23:15
 */
public class Client {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\zhy\\Desktop\\bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");


        //2.根据id获取Bean对象
        IAccountService as  = (IAccountService)ac.getBean("accountService");
//        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
        IAccountService as2  = (IAccountService)ac.getBean("accountService");

        System.out.println(as);
        System.out.println(as2);
        System.out.println(as == as2);
//        System.out.println(adao);
        as.saveAccount();
        ac.close();

        //--------BeanFactory----------
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        IAccountService as  = (IAccountService)factory.getBean("accountService");
//        System.out.println(as);
    }
}

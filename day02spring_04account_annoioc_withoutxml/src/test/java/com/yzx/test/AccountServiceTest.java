package com.yzx.test;

import com.yzx.domain.Account;
import com.yzx.service.IAccountService;
import config.JdbcConfig;
import config.SpringConfiguration;
import config.SpringConfiguration2;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @program: day02spring
 * @description: 使用Junit单元测试：测试我们的配置
 * @author: yanzhixian
 * @create: 2020-05-27 11:34
 */
public class AccountServiceTest {

    @Test
    public void testFindAll() {
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration2.class, JdbcConfig.class);
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3.执行方法
        List<Account> accounts = as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3.执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setName("test anno");
        account.setMoney(12345f);
        //3.执行方法
        as.saveAccount(account);

    }

    @Test
    public void testUpdate() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3.执行方法
        Account account = as.findAccountById(5);
        account.setMoney(23456f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3.执行方法
        as.deleteAccount(5);
    }
}

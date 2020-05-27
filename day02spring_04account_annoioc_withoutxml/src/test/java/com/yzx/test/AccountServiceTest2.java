package com.yzx.test;

import com.yzx.domain.Account;
import com.yzx.service.IAccountService;
import config.SpringConfiguration;
import config.SpringConfiguration2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @program: day02spring
 * @description: 使用Junit单元测试：测试我们的配置
 * @author: yanzhixian
 * @create: 2020-05-27 11:34
 */
public class AccountServiceTest2 {
    ApplicationContext ac = null;
    IAccountService as = null;

    @Before
    public void init() {
        ac = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
        as = ac.getBean("accountService", IAccountService.class);
    }


    @Test
    public void testFindAll() {
        //3.执行方法
        List<Account> accounts = as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //3.执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test anno");
        account.setMoney(12345f);
        //3.执行方法
        as.saveAccount(account);

    }

    @Test
    public void testUpdate() {
        //3.执行方法
        Account account = as.findAccountById(5);
        account.setMoney(23456f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {
        //3.执行方法
        as.deleteAccount(5);
    }
}

package com.yzx.dao.impl;

import com.yzx.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @program: day01spring
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-05-20 23:13
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public  void saveAccount(){
        System.out.println("保存了账户2222222222222");
    }
}

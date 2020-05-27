package com.yzx.dao.impl;

import com.yzx.dao.IAccountDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: day01spring
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-05-20 23:13
 */
//@Component("accountDao")
//@Repository("accountDao")
@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户1111111111111");
    }
}

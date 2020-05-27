package com.yzx.service.impl;

import com.yzx.dao.IAccountDao;
import com.yzx.domain.Account;
import com.yzx.service.IAccountService;

import java.util.List;

/**
 * @program: day02spring
 * @description: 账户的业务层实现类
 * @author: yanzhixian
 * @create: 2020-05-27 11:28
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer acccountId) {
        accountDao.deleteAccount(acccountId);
    }
}

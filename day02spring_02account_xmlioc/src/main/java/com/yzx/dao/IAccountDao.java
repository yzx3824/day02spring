package com.yzx.dao;

import com.yzx.domain.Account;

import java.util.List;

/**
 * @program: day02spring
 * @description: 账户的持久层接口
 * @author: yanzhixian
 * @create: 2020-05-27 11:29
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param acccountId
     */
    void deleteAccount(Integer acccountId);
}

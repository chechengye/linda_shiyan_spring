package com.weichuang.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    AccountDao accountDao;
    @Autowired
    TransactionTemplate transactionTemplate;
    /**
     * 转钱操作
     * @param from
     * @param to
     * @param money
     */

    //@Transactional(readOnly = true)
    @Override
    public void transfer(int from, int to, double money) {

       /* transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {

            }
        });*/
        //减钱操作
        accountDao.reduceMoney(from , money);
        //,........................
        int i = 1/0;
        //加钱操作
        accountDao.addMoney(to , money);
    }
}

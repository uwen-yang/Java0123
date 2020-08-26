package com.pcschool.ocp.d15_thread.case1;

import com.pcschool.ocp.d01.Account;

public class Withdraw implements Runnable {
    //提款工作
    private Account account;
    private int money;
    
    public Withdraw(Account account, int money) {
        this.account = account;
        this.money= money;
        
    }

    public Withdraw(com.pcschool.ocp.d15_thread.case1.Account account, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public void run() {
        account.withdraw(money);
    }
    
}

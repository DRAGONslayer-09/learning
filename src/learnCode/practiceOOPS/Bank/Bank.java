package learnCode.practiceOOPS.Bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accx;
    public Bank(){
        accx = new ArrayList<Account>();
    }
    public void addAccount(Account account){
        accx.add(account);
    }
    public void removeAccount(Account account){
        accx.remove(account);
    }
    public void deposit(Account account, double Amt){
        account.deposit(Amt);
    }
    public void withdraw(Account account, double Amt){
        account.withdraw(Amt);
    }

    public ArrayList<Account> getAccounts() {
        return accx;
    }
}

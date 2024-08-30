package learnCode.practiceOOPS.Bank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank Bnk = new Bank();

        Account account1 = new Account("Tan", 123546789, 500.00 );
        Account account2 = new Account("Kris", 234567891, 2550000.00);

        Bnk.addAccount(account1);
        Bnk.addAccount(account2);
        ArrayList<Account> accx = Bnk.getAccounts();
        for (Account account: accx){
            System.out.println(account.getaccInfo());
        }

        System.out.println(account1.getANum() + " " + account1.getBalance() + " " + account1.getCName());
    }
}

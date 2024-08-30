package learnCode.InheritanceExe.Bank;

public class Bank {
    public static void main(String[] args) {
        SavingsAcc SBM043265 = new SavingsAcc("SBM043265", 5000.0f);
        SBM043265.deposit(1500f);
        System.out.println("Balance after Deposit: " + SBM043265.GetBalance());
        SBM043265.Withdrawl(500.25f);
        System.out.println("Balance after Withdraw: " + SBM043265.GetBalance());
        SBM043265.Withdrawl(6200);
        System.out.println(SBM043265.GetBalance());
    }
}

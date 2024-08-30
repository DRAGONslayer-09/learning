package learnCode.practiceOOPS.Bank;

public class Account {
    private String CName;
    private int ANum;
    private double Balance;

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public int getANum() {
        return ANum;
    }

    public void setANum(int ANum) {
        this.ANum = ANum;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public Account(String CName, int ANum, double Balance){
        this.CName = CName;
        this.Balance = Balance;
        this.ANum = ANum;

    }
    public void deposit (double Amt){
        Balance += Amt;
    }
    public void withdraw(double Amt){
        Balance -= Amt;
    }

    public String getaccInfo() {
        return CName +" Acc.Num: " +  ANum + " Balance: "+ Balance;
    }
}

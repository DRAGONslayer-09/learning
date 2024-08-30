package learnCode.InheritanceExe.Bank;

public class BankAcc {
    private String AccNum;
    private float Balance;
    public BankAcc(String AccNum, float Balance){
        this. AccNum = AccNum;
        this.Balance = Balance;
    }
    public void deposit(float amount){
        Balance += amount;
    }
    public void Withdrawl(float amount){
        if (Balance>=amount){
            Balance-=amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public float GetBalance(){
        return Balance;
    }
}

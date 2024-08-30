package learnCode.InheritanceExe.Bank;

public class SavingsAcc extends BankAcc {

    public SavingsAcc(String AccNum, float Balance) {
        super(AccNum, Balance);
    }

    @Override
    public void Withdrawl(float amount) {
        if(GetBalance() - amount < 5000){
            System.out.println("Minimum required balance is 5000");
        }else{
            super.Withdrawl(amount);
        }
    }
}

package learnCode.InheritanceExe.Office;

public class HR extends Employee{

    public HR(int Salary) {
        super(Salary);
    }

    @Override
    public void Work() {

        System.out.println("manage Accounts");
    }
    public void addEmployee()
    {
        System.out.println("Adding Employee");

}
}

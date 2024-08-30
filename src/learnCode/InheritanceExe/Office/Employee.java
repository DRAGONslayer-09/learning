package learnCode.InheritanceExe.Office;

public class Employee{
    private int Salary;
    public Employee(int Salary){

        this.Salary = Salary;
    }
    public void Work(){

        System.out.println("work");
        }
        public int getSalary(){
            return Salary;
        }
}

package learnCode.InheritanceExe.Office;

public class EmpHR {
    public static void main(String[] args) {
        Employee emp = new Employee(10000);
        Employee manage = new HR(15000);
        System.out.println(emp.getSalary());
        System.out.println(manage.getSalary());
    }
}

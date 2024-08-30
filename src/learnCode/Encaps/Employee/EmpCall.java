package learnCode.Encaps.Employee;

public class EmpCall {
    public static void main(String[] args) {
        employee call = new employee();
        call.setEmployee_name("Tani");
        call.setEmployee_id(512635);
        call.setEmployee_salary(500000);
        System.out.println(call.getEmployee_id());
        System.out.println(call.getEmployee_name());
        System.out.println(call.getEmployee_salary());
    }
}

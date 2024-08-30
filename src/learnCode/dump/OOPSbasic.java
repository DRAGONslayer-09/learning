package learnCode.dump;
class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is: " + id);
        System.out.println("My name is " + name);
    }
}
    public class OOPSbasic {
    public static void main(String[]args){
        Employee Tan = new Employee();
        Employee Chi = new Employee();
        Tan.id = 15;
        Tan.name = "Tanishq";
        Chi.id = 21;
        Chi.name = "Chirag";


        Tan.printDetails();
        Chi.printDetails();
    }

    }


package learnCode.dump.inheritance;
public class inherit1 extends Inheritance {
    class car extends Inheritance {
        private String model = "Mustang";

        public void main(String[] args) {
            car mycar = new car();
            mycar.honk();
            System.out.println(mycar.brand + " " + mycar.model);
        }
    }
}

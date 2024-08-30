package learnCode.dump;

public class variables {

        private int pupAge;
        public static String Breed ="Husky";

        public void SetAge(int Age){
            pupAge = Age;
        }
public int getPupAge(){
       return pupAge;
}
public static void main(String[]age){
            variables mypup = new variables();
            mypup.SetAge(2);
            System.out.println(mypup.pupAge);
            System.out.println(Breed);
}

    }


package learnCode.dump.inheritance;

public class overloading {
    static void tan(){
        System.out.println("Hello World");
    }
    static void tan(int a){

        System.out.println("Peeps" + a);

        tan();
        tan(a = 28);
    }
}



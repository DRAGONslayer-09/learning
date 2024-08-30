package learnCode.overriding;

public class main {


    public static void main(String[] args) {
        Sawan sawan = null;
        Mirav mirav = new Mirav();
        Mira mira = new Mira();
        String children="girl";
        //String children="girl";
        if(children == "boy"){
           sawan = new Mirav();
            System.out.println(mirav.head());
        }else if(children == "girl") {
        sawan = new Mira();
            System.out.println(mira.colour("white"));
            System.out.println(mira.colour("white","black"));
        }
        System.out.println(sawan.weight());
    }

}

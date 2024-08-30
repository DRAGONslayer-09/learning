package learnCode.OldAbstraction;

public class enums {
    public static void main(String[] args) {
        level x = level.high;
        switch(x){
            case LOW:
                System.out.println("Low");
                break;
            case MEDIUM:
                System.out.println("Med");
                break;
            case high:
                System.out.println("high");
        }
    }
}

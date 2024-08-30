package learnCode.dump;

public class BreakContinue {
    public static void main(String[]args){
        int count=0;
        for (int i = 1;i<=10;i++){
            count=count+1;
            if (i==5){
                break;
            }
        }System.out.println(count);

    }
    /*public static void main(String[]args){
        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }*/
}

package learnCode.ThreadsNdMulti;

public class OddEvenThreads {
    private final static int max_num = 20;
    private final static Object lock = new Object();
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
        Thread evenThread = new Thread();
        for (int i=2; i<=max_num; i+=2){
            synchronized (lock){
                while(!isEvenTurn){
                    try{
                        lock.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println( "Even number: " + i);
            }
        }
    }
}

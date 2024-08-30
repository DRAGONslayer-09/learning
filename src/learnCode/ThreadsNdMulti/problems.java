package learnCode.ThreadsNdMulti;

public class problems extends Thread{
    public void run(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        problems thread = new problems();
        thread.start();
    }
}

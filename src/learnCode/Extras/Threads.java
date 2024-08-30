package learnCode.Extras;

public class Threads extends Thread{
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println();
    }
}

package learnCode.Queue;

public class prct {
    private int[]data;

    private static int size = 10;
    int end = 0;

    public prct(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data [end] = item;
        end++;
        return true;
    }
    public void display(){
        for (int i=0; i<end; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println("End");
    }
}

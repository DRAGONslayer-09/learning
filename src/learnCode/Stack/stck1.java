package learnCode.Stack;

public class stck1 {
    public int[]data;
    public static int Default_size= 10;
    int ptr = -1;

    public stck1(){
        this(Default_size);
    }
    public stck1(int size){
        this.data =new int[size];
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("This is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    boolean isFull() {
        return ptr == data.length-1;
    }
    boolean isEmpty(){
        return ptr == -1;
    }

    int pop(){
        return data[ptr--];
    }
}

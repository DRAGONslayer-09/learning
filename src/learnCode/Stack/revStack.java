package learnCode.Stack;

public class revStack {
    private int[]arr;
    private int top;

    public revStack(int size){
        arr = new int [size];
        top = -1;
    }
    public void push(int num){
        if (top == arr.length -1){
            System.out.println("Stack is full");
        } else{
            top++;
            arr[top] = num;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int popele = arr[top];
            top--;
            return popele;
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty (peek)");
            return -1;
        } else{
            return arr[top];
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty(Display)");
        }else{
            for (int x =0; x<arr.length-1;x++){
                System.out.println(arr[x] + " ");
            }
        }
    }
    public void removeAll(){
        top = -1;
    }

}

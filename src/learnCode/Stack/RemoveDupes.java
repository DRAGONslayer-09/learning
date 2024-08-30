package learnCode.Stack;

import java.util.Stack;

public class RemoveDupes {
    public int[]arr;
    public int top;

    public RemoveDupes(int size){
        arr= new int[size];
        top = -1;
    }
    public void push (int x){
        if(top == arr.length -1){
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = x;
        }
    }
    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else {
            int popEle = arr[top];
            top--;
            return popEle;
        }
    }
    public int peek(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return arr[top];
        }
    }
    /*public boolean isEmpty(){
        return top == -1;
    }
    public void remove_dupes(){
        Stack<Integer> st = new Stack<Integer>();
        Stack temp = new Stack(arr.length);
    }*/
}

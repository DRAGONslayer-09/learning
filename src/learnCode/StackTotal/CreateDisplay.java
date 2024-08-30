package learnCode.StackTotal;
import java.util.Stack;

public class CreateDisplay {
    public int [] arr;
    public int top;

    public CreateDisplay(int data){
        arr = new int[data];
        top = -1;
    }
    public void push(int data){
        if (top == arr.length-1){
            System.out.println("Stack is full");
        }else{
            top++;
            arr[top] = data;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            int ele = arr[top];
            top--;
        }
        return top;
    }
    public int peek(){
        if(top == -1) {
            System.out.println("Stack is Empty");
        }return arr[top];
    }

    public static void main(String[] args) {

        Stack<Integer>data = new Stack<>();
        int search =16;
        data.push(16);
        data.push(15);
        data.push(16);
        //System.out.println(data.peek());
        data.push(17);

        System.out.println(data);
        Integer a = new Integer(16);
        for (int x =data.size() ; x>0;x--){
            //System.out.println(17 == data.peek());
            //System.out.println(data.lastElement());
           // System.out.println("hi");
            if(search == data.peek()){
                System.out.println("found on the element");
            }
            data.pop();

            //System.out.print(data.peek()+",");
            //data.remove(data.peek());
        }

           // System.out.println("no element in stack");



    }
}

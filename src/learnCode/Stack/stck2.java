package learnCode.Stack;

public class stck2 {
    public int[] data;
    public int top;

    public stck2(int size) {
        data = new int[size];
        top = -1;
    }

    public void push(int num) {
        if (top == data.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            data[top]=num;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int popele = data[top];
            top--;
        }
        return top;
    }

    public int peek (){
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println(data[top]);
            }
            return data[top];
    }
    public void reverse (){
        if (top == -1) {
             System.out.println("Stack is Empty");
            }
            int[] reverseArr = new int[data.length];
            int index=0;

            while (!isEmpty()) {
                int temp = pop();
                reverseArr[index++] = temp;
            }
                for (int i=0; i< index ;i++){
                    push(reverseArr[i]);
                }
            }

        private boolean isEmpty () {
            return top == -1;
        }
    }

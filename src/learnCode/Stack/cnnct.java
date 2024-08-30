package learnCode.Stack;

public class cnnct extends stck1{
    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int []temp = new int[data.length *2];
            for (int i =0; i< data.length;i++){
                temp[i] = data[i];
            }
            data =temp;
        }
        return super.push(item);
    }

    public static void main(String[] args) {
        stck1 stack = new stck1(5);
        stack.push(25);
        stack.push(16);
        stack.push(33);
        stack.push(66);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }
}

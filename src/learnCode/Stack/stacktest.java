package learnCode.Stack;

import java.util.Stack;

public class stacktest {
    public static void main(String[] args) {
        Stack<Integer> temp = new Stack<Integer>();
        temp.push(2);
        temp.push(12);
        temp.push(100);
        temp.push(1000);
        temp.push(10000);
        temp.push(100000);
        temp.push(2);
        temp.push(12);
        temp.push(100);
        temp.push(1000);
        temp.push(10000);
        temp.push(100000);
        /// printing stack
      //  System.out.println(temp);


        // reversing the stack
   //     System.out.println(temp.size());
        int n= temp.size()-1;
        for(int i=0;i<=n;i++){
            temp.pop();
           // System.out.println(i);
            System.out.println(temp);
          /*  switch (temp.pop()) {
                case 10000:
                    System.out.println("10 k");
                    break;
                default:
                    System.out.println("no elsement");
            }
*/

            //System.out.print(temp.pop()+",");
        }

        // using while

      /*  while(temp.peek()!= null){
            System.out.print(temp.pop()+",");
        }*/


    }
}

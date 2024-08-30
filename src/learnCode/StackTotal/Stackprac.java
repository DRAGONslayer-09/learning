package learnCode.StackTotal;

import java.util.Scanner;
import java.util.Stack;

public class Stackprac {
    public static void main(String[] args) {
        Stack<Integer> prac = new Stack<Integer>();
        Stack<Integer> pracx = new Stack<Integer>();
        prac.push(16);
        prac.push(20);
        prac.push(65);
        prac.push(52);
        prac.push(36);
        pracx.push(43);
        pracx.push(97);
        pracx.push(52);
        pracx.push(81);
        pracx.push(29);
        pracx.push(68);

//get first and last element of stack
        /*System.out.println(prac.size());
        System.out.println(prac.get(0));
        System.out.println(prac.get(prac.size()-1));
*/
//add all the elements in stack with having stack with same values

        /*Object clout = prac.clone();
        int x = 0;
        int chec = prac.size();
        for (int i =0;i<=chec-1;i++){
            x+= prac.pop();
        }
        System.out.println("Total of all elements from stack" + x);
        System.out.println(clout);
        prac.push(15);
*/

//remove duplicates

       /* Stack<Integer> clout = new Stack<Integer>();
        clout = prac;
        // System.out.println(prac);
       // System.out.println(clout);

        for (int i = 0; i>=clout.size();i++){
            for (int j= 0; j>prac.size(); j++){

                if (clout.get(clout.size()) == prac.get(prac.size()) && clout.size() != prac.size()  ){
                    clout.pop();
                }
                System.out.println(clout);
            }
        }
*/
        /*int chc = prac.size();
        for(int i = 0 ; i<chc ; i++){
            prac.pop();
        }
        System.out.println(prac);
*/

        //odd and even elements
    /*    Stack<Integer>Even = new Stack<Integer>();
        Stack<Integer>Odd = new Stack<>();
        System.out.println(prac);
        System.out.println(prac.peek());
*/

//Odd Numbers and Even numbers Stack using While Loop

        /*while(!prac.isEmpty()){
            int element = prac.pop();
            if (element % 2 == 0){
                Even.add(element);
            }else {
                Odd.push(element);
            }
        }
        System.out.println(Even);
        System.out.println(Odd);

 //Odd Numbers and Even Numbers Stack using For Loop

        int x = prac.size();
        for (int i = 0 ; i < x; i++){
            int trix = prac.pop();
            if (trix % 2==0){
                Even.push(trix);
            }else{
                Odd.push(trix);
            }
        }
        System.out.println("Stack of Even Numbers " + Even);
        System.out.println("Stack of Odd Numbers " + Odd);
        */

//Swap top two elements
        /*System.out.println("Before Swapping " + prac);
        int x = prac.pop();
        int y = prac.pop();
        System.out.println(prac.push(x));
        prac.push(y);
        System.out.println("After Swapping " + prac);*/
//Move nth element to top
        /*System.out.println(prac);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your element: ");
        int x = sc.nextInt();
        int y = prac.remove(x);
        prac.push(y);
        System.out.println(prac.peek());
        System.out.println(prac);*/
// insert an element in array list in top position
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(47);
        list.add(41);
        list.add(39);
        list.add(33);
        list.add(26);
        list.add(22);
        System.out.println(list.lastIndexOf(22));
        System.out.println(list.size()-1);
        list.add(11);
        System.out.println(list);*/


// insert an element in middle of the array list
       /* System.out.println(list.size());
        int ls = list.size();
        int res = list.size()/2;
        System.out.println(res);
        list.add(res,55);
        System.out.println(list);*/

// Combine two stacks into one
/*
        System.out.println(prac.peek());
        prac.addAll(pracx);
        System.out.println(prac.peek());
*/

// Reverse a Stack using conditional Statement
        /*Stack<Integer> store = new Stack<Integer>();
        System.out.println(prac);
        while(!prac.isEmpty()){
            store.push(prac.pop());
        }
        System.out.println(store);
        */
//  take odd elements from both stacks and store it in a different stack
       /* Stack<Integer> Odd = new Stack<>();
        while(!prac.isEmpty()){
            int x = prac.pop();
            if (x % 2 != 0){
                Odd.push(x);
            }
        }

        while(!pracx.isEmpty()){
            int y = pracx.pop();
            if (y % 2 != 0){
                Odd.push(y);
            }
        }
        System.out.println(Odd);
*/
        /*for (int i = 0; i< pracx.size();i++){
            int rem = pracx.remove(pracx.size()-1);
            if (rem % 2 != 0){
                Odd.push(pracx);
            }
        }*/

//Sort a stack without using recursion
       /* System.out.println(prac);


        Stack<Integer> mini = new Stack<>();
        while(!prac.isEmpty()) {
            System.out.println("hi"+prac);
            int min = prac.pop();
            while (!mini.isEmpty() && mini.peek() > min) {
                System.out.println(" whilemini"+mini);
                prac.push(mini.pop());
            }
            mini.push(min);
            System.out.println("outside while "+mini);
        }
        System.out.println(mini);*/

// implement a stack if elements checks the condition
        /*int siz= prac.get(prac.size()-1);
            for (int i = 0 ; i < 1 ; i++){
                if (prac.get(prac.size()-1)%2 == 0){
                System.out.println(prac);
            }
        }*/

        // remove the element which does not follow condition of a stack

/*Stack<Integer> eligible = new Stack<>();
        int size =prac.size();
        for (int i = 0; i<size; i++){
            if (prac.get(prac.size()-1)% 2 ==0){
                eligible.push(prac.pop());
            }else {
                //prac.remove(prac.peek());
                prac.pop();
            }
        }
        System.out.println(eligible);
        */

        }
    }


package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

public class exchangeFandL {
    // exchange first and last nodes
    static class Node9{
        int value;
        Node9 next,prev;
        Node9(int x){
            value = x;
            next = prev = null;
        }
    }
    static Node9 exchange (Node9 head){
        if (head == null || head.next == null){
            return head;
        }
        Node9 first = head;
        Node9 last = head;
        while(last.next!= null){
            last = last.next;
        }

        if (first.next == last) {
            last.next = first;
            first.prev = last;
            last.prev = null;
            first.next = null;
            return last;
        }
        Node9 tempNext = first.next;
        Node9 tempPrev = last.prev;

        first.next = null;
        first.prev = tempPrev;
        last.prev = null;
        last.next = tempNext;

        if (first.prev != null) {
            first.prev.next = first;
        }
        if (last.next != null) {
            last.next.prev = last;
        }

        return last;
    }
    static Node9 add(Node9 head, int value){
        Node9 newval = new Node9(value);
        if (head == null) {
            return newval;
        } else {
            Node9 temp = newval;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newval;
            newval.prev = temp;
        }
        return head;
    }
    static void print(Node9 head){
        while(head!= null){
            System.out.println(head.value);
            head= head.next;
        }
    }
    public static void main(String[] args) {
        Node9 head = null;
        head= add(head, 15);
        head= add(head, 30);
        head= add(head, 45);
        head= add(head, 60);
        head = exchange(head);
        print(head);
    }
    }


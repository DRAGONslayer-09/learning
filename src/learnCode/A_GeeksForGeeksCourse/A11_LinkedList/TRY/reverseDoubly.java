package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

public class reverseDoubly {
    // reverse the doubly linked list
    static class Nodet{
        int value;
        Nodet next,prev;
        Nodet(int x){
            value = x;
            next = prev = null;
        }
    }
    static Nodet rev(Nodet curr){
        if (curr==null)
            return null;
        Nodet temp  = curr.prev;
        curr.prev =   curr.next;
        curr.next = temp;
        if (curr.prev == null)
            return curr;
        return rev(curr.prev);
    }
    static void print(Nodet head){
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
    static Nodet add(Nodet head, int value){
        Nodet newv = new Nodet(value);
        if (head == null){
            return newv;
        }else{
            Nodet temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }temp.next = newv;
            newv.prev = temp;
        }return head;
    }
    public static void main(String[] args) {

        Nodet head = null;
        head = add(head,12);
        head = add(head,24);
        head = add(head,36);
        head = add(head,48);
        head = add(head,60);
        head = rev(head);
        System.out.println("Reversed List: ");
        print(head);
    }
}

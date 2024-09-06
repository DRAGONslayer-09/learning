package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

public class removeDupes {
    static class Nodem{
        int value;
        Nodem next,prev;
        Nodem(int x){
            value = x;
            next =prev = null;
        }
    }
    static Nodem add(Nodem head, int value){
        Nodem ad = new Nodem(value);
        if (head == null){
            return ad;
        } else{
            Nodem temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = ad;
            ad.prev = temp;
        }return head;
    }
    static void remove(Nodem head){
        Nodem curr = head;
        while(curr != null){
            Nodem run = curr.next;
            while(run!=null){
                if (curr.value == run.value){
                    if (run.next!= null){
                        run.next.prev = run.prev;
                    }
                    if (run.prev != null){
                        run.prev.next = run.next;
                    }
                }
                run =run.next;
            }
            curr = curr.next;
        }
    }
    static void print(Nodem head){
        while(head!= null){
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Nodem head = null;
        head = add(head, 10);
        head = add(head,15);
        head = add(head,20);
        head = add(head, 10);
        head = add(head,25);
        remove(head);
        print(head);
    }
}

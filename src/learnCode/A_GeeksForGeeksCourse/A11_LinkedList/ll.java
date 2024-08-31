package learnCode.A_GeeksForGeeksCourse.A11_LinkedList;

public class ll {
    static class Node {
        int val;
        Node next;
        Node(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public void addl(Node head, int val){
        Node last = new Node(val);
        if (head == null){
            head = last;
        }
        Node curr = head;
        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = last;

    }
    public void printx(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public Node addf(Node head,int val) {
        Node newx = new Node(val);
        if (head == null) {
            head = newx;
            return head;
        }
        newx.next = head;
        return newx;
    }

    public Node delf(Node head){
        if (head==null){
            return head;
        }
        //head = null;
        head = head.next;
        return head;
    }
    public Node delL(Node head){
        if (head==null)
            return null;

        Node secL = head;
        Node Last = secL.next;
        while(Last.next!=null){
            secL = secL.next;
            Last = Last.next;
        }secL.next = null;
        return head;
    }

    public static void main(String[] args) {
        ll list = new ll();
        Node head = new Node(3);
        Node newNode =list.addf(head,2);
        list.printx(newNode);
        list.addl(head,1);
       Node latest= list.addf(newNode,4);
       Node deleteNode =list.delf(latest);
       Node delLast = list.delL(latest);
        //list.printx(head);
       list.printx(deleteNode);
       list.printx(delLast);



    }
}


package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice;

public class prac10 {
    // search an element in ll
    class node {
        node head;
        int data;
        node next;

        node(int x) {
            data = x;
            next = null;
        }

        class ll {
            public void push(int newD) {
                node newNode = new node(newD);
                newNode.next = head;
                head = newNode;
            }

            public boolean search(node head, int x) {
                node cur = head;
                while (cur != null) {
                    if (cur.data == x)
                        return true;
                    cur = cur.next;
                }
                return false;
            }
        }
    }
        public void main(String[] args) {
            prac10 linked = new prac10();
        }

    }
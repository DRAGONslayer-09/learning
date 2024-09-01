package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;
class Nodet {
        int data;
        Nodet next;

        Nodet(int d) {
            data = d;
            next = null;
        }
    }

    public class NewWaysPrac {
        public static void main(String[] args) {
            Nodet head = addNodes(1, 2, 1, 2, 1, 3, 1);

            // Optionally print the list to verify
            printList(head);
        }

        static Nodet addNodes(int... values) {
            if (values.length == 0) return null;
            Nodet head = new Nodet(values[0]);
            Nodet current = head;
            for (int i = 1; i < values.length; i++) {
                current.next = new Nodet(values[i]);
                current = current.next;
            }
            return head;
        }

        static void printList(Nodet head) {
            Nodet temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }


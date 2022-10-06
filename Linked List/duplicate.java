public class duplicate {
    static class LinkedList {

        static Node head;

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                next = null;
            }
        }

        static void print() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        static void add_first(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        static void add_last(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }

        static void removeDuplicate() {
            Node current = head;
            while (current.next != null) {
                if (current.next.data == current.data) {
                    current.next = current.next.next;
                    continue;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add_last(1);
        list.add_last(1);
        list.add_last(2);
        list.add_last(3);
        list.add_last(3);
        list.removeDuplicate();
        list.print();
    }

}

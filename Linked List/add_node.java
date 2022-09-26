public class add_node {

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

        static void add_node(int data, int pos) {
            
            Node val = new Node(data);
            if(pos==1){
                val.next = head;
                head = val;
                return;
            }
            int count = 1;
            Node current = head;
            while (pos != (++count))
                current = current.next;
            Node cont = current.next;
            val.next = cont;
            current.next = val;

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add_first(4);
        list.add_first(3);
        list.add_first(2);
        list.add_first(1);
        list.add_node(10, 3);
        list.print();
    }
}
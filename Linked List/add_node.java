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

        static void add_node(int data, int pos) {

            Node val = new Node(data);
            if (pos == 1) {
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

        static void delete_first(){
            if (head == null) {
                System.out.println("Empty list");
                return;
            }
            head=head.next;
        }

        static void delete_last() {
            if (head == null) {
                System.out.println("Empty list");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }

            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        static void delete_node(int pos){
            if (head == null) {
                System.out.println("Empty list");
                return;
            }
            if(pos==1){
                head=head.next;
                return;
            }
            int counter=1;
            Node current = head;
            while((counter+1)!=pos){
                counter++;                
                current=current.next;
            }
            
            current.next=current.next.next;
                

        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add_first(4);
        list.add_first(3);
        list.add_first(2);
        list.add_first(1);
        list.add_last(5);
        list.add_node(10, 3);
        list.delete_first();
        list.delete_last();
        list.delete_node(2);
        list.print();
    }
}
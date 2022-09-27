public class find_middle {
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
        static int size(){            
            int ans=0;
            Node current = head;
            while (current != null) {
                current = current.next;
                ans++;
            }
            return ans;

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

        static int middle(){
            if(head==null){
                System.out.println("Empty list");
                return -1;
            }

            Node slow=head;
            Node fast=head;

            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            
            return slow.data;
        }
    }

        public static void main(String[] args) {
            LinkedList list =new LinkedList();
            list.add_last(1);
            list.add_last(2);
            list.add_last(3);
            list.add_last(4);
            list.add_last(5);
            System.out.println(list.middle());

        }
}

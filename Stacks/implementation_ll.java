public class implementation_ll{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;
        
        boolean isEmpty(){
            return head == null ;
        }

        void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            
                newNode.next = head;
                head = newNode;           

        }

        int pop(){
            if (isEmpty())
            return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        int peak(){
            if (isEmpty())
            return -1;
            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);    
        s.push(2);  
        s.push(3);
        s.push(4);  

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
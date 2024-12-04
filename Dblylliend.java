class Dblyll {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public void insertAtEnd(int data){
        Node newnode=new Node(data);
         if (head == null) {
            head = newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
            newnode.prev=temp;
            temp.next=newnode;
        
    }

    
    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Dblyll list = new Dblyll();
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.printAll();
    }
}

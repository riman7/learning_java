public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert, print, delete, size

    // add first and last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {

        if (head == null) {
            System.out.print("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public void deleteFirst(){
        if (head==null){
            System.out.print("List is empty.");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.print("List is empty.");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
    
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;

    }

    public void reverseIterate(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;

    }

    public Node reverseRecurision(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecurision(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;

    }

    public static void main(String args[]){

        LL list = new LL(); 

        list.addFirst("This");
        list.addLast("is");
        list.addFirst("hii");
        list.deleteFirst();
        list.deleteLast();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
    }
}
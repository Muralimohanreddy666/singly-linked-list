public class singlyLinkedList {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    Node head;

   
    public singlyLinkedList() {
        head = null;
    }

    
    public void insertAtEnd(int data) {
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

    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    
    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();

        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.printList(); 

        list.insertAtBeginning(2);
        list.printList(); 

        System.out.println("Search 10: " + list.search(10)); 
        System.out.println("Search 100: " + list.search(100)); 
    }
}

public class LinkedList1 {
    public class Node {
        int data;
        Node next;

        // Constructor for Node class
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail of the LinkedList
    public static Node head;
    public static Node tail;

    // Method to add an element at the beginning of the LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data); // Corrected constructor call
        if (head == null) {
            head = tail = newNode; // Initialize head and tail if the list is empty
            return;
        }
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update the head to be the new node
    }

    // Main method to test the LinkedList
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(1); // Add elements to the LinkedList
        l1.addFirst(2);

        // Code to print the LinkedList elements
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}


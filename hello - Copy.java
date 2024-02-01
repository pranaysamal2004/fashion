import java.util.Scanner;

// Define the structure for a node in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the linked list class
class LinkedList {
    Node head;

    // Function to insert a new node at the end of the linked list
    void insertNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to display the linked list
    void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class hello {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); // Create a linked list

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; ++i) {
            int value = scanner.nextInt();
            linkedList.insertNode(value);
        }

        System.out.print("Linked List: ");
        linkedList.displayList();

        // You can perform other operations on the linked list as needed

        scanner.close();
    }
}

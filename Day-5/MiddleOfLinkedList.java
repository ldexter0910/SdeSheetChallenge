// Problem Statement
// Given the head node of the singly linked list, return a pointer pointing to the middle of the linked list.
// If there are an odd number of elements, return the middle element if there are even elements return the one which is farther from the head node.
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
    public static Node findMiddle(Node head) {
        // Write your code here
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

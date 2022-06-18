// Problem Statement
// Given a singly linked list of integers. Your task is to return the head of the reversed linked list.
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class ReverseLinkedList {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        // Write your code here!
        LinkedListNode<Integer> curr, next, prev;
        curr = head;
        prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

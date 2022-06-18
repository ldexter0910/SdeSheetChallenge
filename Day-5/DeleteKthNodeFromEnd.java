// Problem Statement
// You have been given a singly Linked List of 'N' nodes with integer data and an integer 'K'. Your task is to remove the Kth node from the end of the given Linked List.
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class DeleteKthNodeFromEnd {
    public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int k) {
        // Write your code here.
        if (k == 0)
            return head;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (k > 0) {
            fast = fast.next;
            k--;
        }

        if (fast == null)
            return slow.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}

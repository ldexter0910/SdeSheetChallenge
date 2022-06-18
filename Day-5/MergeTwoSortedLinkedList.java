// Problem Statement
// You are given two sorted linked lists. You have to merge them to produce a combined sorted linked list. You need to return the head of the final linked list.
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeTwoSortedLinkedList {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        LinkedListNode<Integer> resHead, resCurr;
        resHead = null;
        resCurr = null;

        while (first != null && second != null) {
            LinkedListNode<Integer> x = null;
            if (first.data <= second.data) {
                x = first;
                first = first.next;
            } else {
                x = second;
                second = second.next;
            }

            if (resHead == null) {
                resHead = resCurr = x;
            } else {
                resCurr.next = x;
                resCurr = x;
            }
        }

        if (first != null) {
            if (resHead == null) {
                resHead = resCurr = first;
            } else {
                resCurr.next = first;
            }
        }

        if (second != null) {
            if (resHead == null) {
                resHead = resCurr = second;
            } else {
                resCurr.next = second;
            }
        }

        return resHead;
    }
}

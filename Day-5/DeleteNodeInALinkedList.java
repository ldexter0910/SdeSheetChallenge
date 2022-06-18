// Problem Statement
// You are given a Singly Linked List of integers and a reference to the node to be deleted.
// Every node of the Linked List has a unique value written on it.
// Your task is to delete that node from the linked list.
// A singly linked list is a linear data structure in which we can traverse only in one direction i.e. from Head to Tail.
// It consists of several nodes where each node contains some data and a reference to the next node.

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeInALinkedList {
    public static void deleteNode(LinkedListNode<Integer> node) {
        // Write your code here.
        while (node != null) {
            node.data = node.next.data;
            if (node.next.next == null) {
                node.next = null;
                return;
            }
            node = node.next;
        }
    }
}
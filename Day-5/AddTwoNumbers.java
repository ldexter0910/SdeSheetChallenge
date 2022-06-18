// Problem Statement
// You are given two linked lists representing two non-negative numbers.
// The digits in the linked list are stored in reverse order, i.e. starting from least significant digit (LSD) to the most significant digit (MSD), and each of their nodes contains a single digit.
// Your task is to find the sum list and return the head of the sum list where the sum list is a linked list representation of the addition of two numbers.
class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class AddTwoNumbers {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode resHead = null, resCurr = null;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int x = head1 != null ? head1.data : 0;
            x += head2 != null ? head2.data : 0;
            x += carry;

            carry = x / 10;
            x = x % 10;
            LinkedListNode node = new LinkedListNode(x);
            if (resHead == null) {
                resHead = resCurr = node;
            } else {
                resCurr.next = node;
                resCurr = resCurr.next;
            }

            if (head1 != null)
                head1 = head1.next;

            if (head2 != null)
                head2 = head2.next;
        }
        return resHead;
    }
}

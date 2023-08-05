
// https://leetcode.com/contest/biweekly-contest-10/problems/insert-into-a-sorted-circular-linked-list/

import java.util.*;

public class InsertGreatestCommonDivisorsInLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            int gcd = calculateGCD(current.val, current.next.val);
            ListNode newNode = new ListNode(gcd);
            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;
        }

        return head;
    }

    private int calculateGCD(int firstNode, int nextNode) {
        while (nextNode != 0) {
            int temp = nextNode;
            nextNode = firstNode % nextNode;
            firstNode = temp;
        }
        return firstNode;
    }

    public static void main(String[] args) {
        /*
         * Input: head = [18,6,10,3]
         * Output: [18,6,6,2,10,1,3]
         */
        InsertGreatestCommonDivisorsInLinkedList obj = new InsertGreatestCommonDivisorsInLinkedList();
        ListNode head = obj.new ListNode(18);
        head.next = obj.new ListNode(6);
        head.next.next = obj.new ListNode(10);
        head.next.next.next = obj.new ListNode(3);
        head = obj.insertGreatestCommonDivisors(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

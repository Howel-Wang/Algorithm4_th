package cn.howel.middle;

public class Solution1 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        while (l1.next != null || l2.next != null) {
            System.out.println(getValSum(l1));
        }
        return null;
    }

    public static int getValSum(ListNode node) {
        int value = 0;
        int count = 0;
        while (node != null) {
            value = node.val;
            node = node.next;
            count++;
        }
        for (int i = 0; i < count; i++) {
            value *= 10;
        }
        return value;
    }

    static class ListNode {

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

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        System.out.println(getValSum(node1));

    }
}
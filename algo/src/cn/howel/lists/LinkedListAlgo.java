package cn.howel.lists;

/**
 * @author howel
 * @version 1.0.0
 * @Description
 */
public class LinkedListAlgo {

    /*
    创建Node节点
     */
    public static Node createNode(int value) {
        return new Node(value,null);
    }

    /*
    求中间节点
     */
    public static Node findMiddleNode(Node list) {
        if (list == null) {
            return null;
        }
        Node fast = list;
        Node slow = list;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /*
    删除倒数第K个节点
     */
    public static Node deleteLastKth(Node list,int k) {
        Node fast = list;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }


        return null;
    }

    /*
    打印链表的所有节点
     */
    public static void printAll(Node list) {
        Node p = list;
        while (p != null) {
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    /*
    节点类
     */
    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public int getData() {
            return data;
        }
    }

}

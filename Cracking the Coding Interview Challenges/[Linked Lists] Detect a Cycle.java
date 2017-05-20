/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

/* Source: https://www.hackerrank.com/challenges/ctci-linked-list-cycle */

public boolean hasCycle(Node head) {
        Set<Node> node = new HashSet<>();
        while(head != null){
            node.add(head);
            head = head.next;
            if (node.contains(head))return true;
        }
        return false;
}
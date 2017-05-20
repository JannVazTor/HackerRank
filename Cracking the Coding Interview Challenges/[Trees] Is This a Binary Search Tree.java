package com.company;

import java.util.ArrayList;

/* Source: https://www.hackerrank.com/challenges/ctci-is-binary-search-tree  */

class Node
{
    public int data;
    public Node left;
    public Node right;
}

class Solution {
    ArrayList<Integer> dataTracker = new ArrayList<>();
    boolean isValid = true;

    public static void main(String[] args) {
        // write your code here
        Solution s = new Solution();
        Node root = new Node() {{
            data = 3;
            left = new Node() {{
                data = 2;
                left = new Node() {{
                    data = 1;
                    left = null;
                    right = null;
                }};
                right = new Node() {{
                    data = 4;
                    left = null;
                    right = null;
                }};
            }};
            right = new Node() {{
                data = 6;
                left = new Node() {{
                    data = 5;
                    left = null;
                    right = null;
                }};
                right = new Node() {{
                    data = 7;
                    left = null;
                    right = null;
                }};
            }};
        }};
        System.out.print(s.checkBST(root) ? "Yes" : "No");
    }

    public boolean checkBST(Node root) {
        inOrderCheck(root);
        return isValid;
    }

    public void inOrderCheck(Node node) {
        if (node == null) return;
        inOrderCheck(node.left);
        if (dataTracker.size() != 0) {
            dataTracker.add(node.data);
            int i = dataTracker.size() - 1;
            if (dataTracker.get(i - 1) >= dataTracker.get(i)) isValid = false;
        } else {
            dataTracker.add(node.data);
        }
        inOrderCheck(node.right);
    }
}




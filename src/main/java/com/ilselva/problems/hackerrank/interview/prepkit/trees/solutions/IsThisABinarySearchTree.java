package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions;

import java.util.Vector;

//https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem
public class IsThisABinarySearchTree {

    // List of node data values:
    Vector<Integer> values;
    // Total number of nodes in the tree:
    private int count;

    IsThisABinarySearchTree() {
        this.values = new Vector<Integer>();
        this.count = 0;
    }

    boolean checkBST(Node root) {

        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean check(Node root, int min, int max) {

        if (root == null) {
            return true;
        }
        if(root.data <=min || root.data >= max) {
            return false;
        }
        return check(root.left, min, root.data) && check(root.right, root.data, max);
    }

    void inOrder(Node root, int levels) {

        if (root != null) {
            // If there are still unfilled levels, fill left subtree:
            if (levels > 0) {
                // Create a new left child node:
                root.left = new Node();
                inOrder(root.left, levels - 1);
            }

            // Set node data:
            root.data = values.elementAt(count);
            count++;

            // If there are still unfilled levels, fill right subtree:
            if (levels > 0) {
                // Create a new right child node:
                root.right = new Node();
                inOrder(root.right, levels - 1);
            }
        }
    }

}
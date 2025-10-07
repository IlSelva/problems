package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions;

public class HeightOfBinaryTree {

    public static int height(Node root) {
        // Write your code here.
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

}
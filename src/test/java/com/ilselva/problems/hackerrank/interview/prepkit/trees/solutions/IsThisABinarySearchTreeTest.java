package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

class IsThisABinarySearchTreeTest {

    @Test
    void checkBSTCase0() {

        boolean result = true;
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int height = 2;

        Iterator<Integer> iterator = list.iterator();
        // Read data values for tree's nodes:
        IsThisABinarySearchTree tree = new IsThisABinarySearchTree();
        while (iterator.hasNext()) {
            tree.values.add(iterator.next());
        }

        // Fill tree:
        Node root = new Node();
        tree.inOrder(root, height);

        Assertions.assertEquals(result, tree.checkBST(root));
    }

    @Test
    void checkBSTCase1() {

        boolean result = false;
        List<Integer> list = List.of(1, 2, 4, 3, 5, 6, 7);
        int height = 2;

        Iterator<Integer> iterator = list.iterator();
        // Read data values for tree's nodes:
        IsThisABinarySearchTree tree = new IsThisABinarySearchTree();
        while (iterator.hasNext()) {
            tree.values.add(iterator.next());
        }

        // Fill tree:
        Node root = new Node();
        tree.inOrder(root, height);

        Assertions.assertEquals(result, tree.checkBST(root));
    }

    @Test
    void checkBSTCase2() {

        boolean result = true;
        List<Integer> list = List.of(3, 5, 7, 9, 11, 13, 15);
        int height = 2;

        Iterator<Integer> iterator = list.iterator();
        // Read data values for tree's nodes:
        IsThisABinarySearchTree tree = new IsThisABinarySearchTree();
        while (iterator.hasNext()) {
            tree.values.add(iterator.next());
        }

        // Fill tree:
        Node root = new Node();
        tree.inOrder(root, height);

        Assertions.assertEquals(result, tree.checkBST(root));
    }


}
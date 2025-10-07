package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class HeightOfBinaryTreeTest {

    @Test
    void heightCase0() throws IOException {

        int result = 3;
        Scanner scan = new Scanner(Files.newInputStream(
                Paths.get("src/test/resources/hackerrank/prepkit/trees/HeightOfBinaryTreeInput0")));
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        scan.close();
        Assertions.assertEquals(result, HeightOfBinaryTree.height(root));
    }

    @Test
    void heightCase1() throws IOException {

        int result = 0;
        Scanner scan = new Scanner(Files.newInputStream(
                Paths.get("src/test/resources/hackerrank/prepkit/trees/HeightOfBinaryTreeInput1")));
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        scan.close();
        Assertions.assertEquals(result, HeightOfBinaryTree.height(root));
    }

    @Test
    void heightCase2() throws IOException {

        int result = 3;
        Scanner scan = new Scanner(Files.newInputStream(
                Paths.get("src/test/resources/hackerrank/prepkit/trees/HeightOfBinaryTreeInput2")));
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        scan.close();
        Assertions.assertEquals(result, HeightOfBinaryTree.height(root));
    }

}
package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class LowestCommonAncestorTest {

    @Test
    void lcaCase0() throws IOException {
        int result = 4;
        Scanner scan = new Scanner(Files.newInputStream(
                Paths.get("src/test/resources/hackerrank/prepkit/trees/LowestCommonAncestorInput0")));
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Assertions.assertEquals(result, LowestCommonAncestor.lca(root, v1, v2).data);
    }

    @Test
    void lcaCase1() throws IOException {
        int result = 1;
        Scanner scan = new Scanner(Files.newInputStream(
                Paths.get("src/test/resources/hackerrank/prepkit/trees/LowestCommonAncestorInput1")));
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Assertions.assertEquals(result, LowestCommonAncestor.lca(root, v1, v2).data);
    }

    @Test
    void lcaCase2() throws IOException {
        int result = 5;
        Scanner scan = new Scanner(Files.newInputStream(
                Paths.get("src/test/resources/hackerrank/prepkit/trees/LowestCommonAncestorInput2")));
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Assertions.assertEquals(result, LowestCommonAncestor.lca(root, v1, v2).data);
    }


}
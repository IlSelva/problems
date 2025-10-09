package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions;

import com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions.huffman.HuffmanLeaf;
import com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions.huffman.Node;

//https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
public class HuffmanDecoding {

    /**
     * The worst case scenario would be if a String has non-repeating characters, for example 'abcd'
     * in this case the decoding process will have a complexity of O(n) where n is the size of the encoded string s
     *
     * @param s    an Huffman encoded String
     * @param root the root of the huffman tree
     * @return the decoded String s
     */
    static String decode(String s, Node root) {

        Node curr = root;
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i) == '0' ? curr.left : curr.right;

            if (curr instanceof HuffmanLeaf) {
                decoded.append(curr.data);
                curr = root;
            }
        }

        return decoded.toString();
    }

}
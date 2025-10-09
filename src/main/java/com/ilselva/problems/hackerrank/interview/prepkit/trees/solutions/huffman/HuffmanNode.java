package com.ilselva.problems.hackerrank.interview.prepkit.trees.solutions.huffman;


public class HuffmanNode extends Node {

    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}
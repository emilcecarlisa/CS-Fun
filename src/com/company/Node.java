package com.company;

public class Node {

    public static void main(String[] args) { };

    private int data;
    private Node nextNode;

    public Node(int value) {
        data = value;
        nextNode = null;
    }

    public int getData() { return data; }

    public void setNextNode(Node node) { nextNode = node;}

    public Node getNextNode() { return nextNode; }
}
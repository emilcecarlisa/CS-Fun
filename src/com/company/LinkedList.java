package com.company;

public class LinkedList {
    private Node head;

    public static void main(String[] args) { };

    public LinkedList() {
//        list = new LinkedList(); will create Singleton-single instance of list
        head = null;
    }

    public void setHead(Node node) {
        head = node;
    }

    public Node getHeadNode() { return head; }

    public void insertNode(Node node) {
        head.setNextNode(node);
    }

}

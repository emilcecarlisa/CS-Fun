package com.company;

public class LinkedList {
    private Node head;

//    public static void main(String[] args) { };

    public LinkedList() {
        head = null;
    }

    public void setHead(Node node) {
        head = node;
    }

    public Node getHeadNode() { return head; }

    public void insertNode(Node node) {
        head.setNextNode(node);
    }

    public int getValue(int index) {
        int count;
        count = 1;

        if (head == null) { return 0; }

        while (count != index) {
            count ++;
            head = head.getNextNode();
        }

        return head.getData();

    }

}

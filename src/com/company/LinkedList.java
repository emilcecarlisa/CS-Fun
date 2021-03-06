package com.company;

public class LinkedList {
    private static Node head;
//    public static void main(String[] args) { };

    public LinkedList() {
        head = null;
    }

    public void setHead(Node node) {
        head = node;
    }

    public Node getHeadNode() { return head; }

    public void insertNode(Node node) {
        node.setNextNode(head);
        head = node;
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

    public static Boolean findValue(int value) {
        if (head == null) { return false; }

        while (head.getData() != value) {
            head = head.getNextNode();
        }

        return true;
    }

    public Boolean deleteNode(int value) {
        Node temp = head;
        Node prev = null;

        if (head == null) { return false;}
        if (temp != null && temp.getData() == value) {
            head = temp.getNextNode();
            return true;
        }

        while (temp != null && temp.getData() != value) {
            prev = temp;
            temp = temp.getNextNode();
        }

        if (temp == null) {return false;}

        Node next = prev.getNextNode();
        next = temp.getNextNode();
        return true;
    }

}

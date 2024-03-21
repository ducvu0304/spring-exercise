package com.example.handleexceptiondemo.linkedlist;

public class LinkedList {
    Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertAtFront(int newData) {
        // 1 allocate node
        Node newNode = new Node();

        // 2. put in the data
        newNode.setData(newData);

        // 3.Make next of new node as head
        newNode.setNext(head);

        // 4. move the head to point to the new node;
        head =  newNode;
    }

    public void insertAfterNode(Node prevNode, int newData) {

        if(prevNode == null) {
            System.out.println("The given previous node cannot be NULL");
            return;
        }

        // 1. allocate new node and put in the data
        Node newNode = new Node();
        newNode.setData(newData);

        // 2. Make next of new node as next of prev_node
        newNode.setNext(prevNode.next);

        // 3. move the next of prev_node as new_node
        prevNode.setNext(newNode);
    }

    public void printList() {
        Node node = head;

        while (node != null) {
            System.out.print(node.getData() + " ");
            node =  node.getNext();
        }
        System.out.println();
    }

    public Node getNodeByValue(int value) {
        Node node =  head;

        while (node != null) {
            if (node.getData() == value) {
                return node;
            }
            node = node.getNext();
        }

        return null;
    }
}

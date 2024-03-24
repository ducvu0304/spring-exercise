package com.example.handleexceptiondemo.linkedlist;

public class RunDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtFront(5);
        linkedList.insertAtFront(4);
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(3);

        linkedList.printList();

        Node afterNode =  linkedList.getNodeByValue(2);
        if(afterNode != null) {
            linkedList.insertAfterNode(afterNode, 2);
            linkedList.printList();
        }else {
            System.out.println("the afterNode cannot be NULL");
        }

    }
}

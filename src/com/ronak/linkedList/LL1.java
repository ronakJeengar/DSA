package com.ronak.linkedList;

public class LL1 {

    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertLast(8);
        list.printlist();
        list.deleteFirst();
        list.printlist();
        list.deleteLast();
        list.printlist();
        list.getSize();

    }
}

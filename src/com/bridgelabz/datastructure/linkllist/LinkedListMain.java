package com.bridgelabz.datastructure.linkllist;

public class LinkedListMain {
    public static void main(String[] args) {
            System.out.println("---------Welcome to the LinkedList program---------");
            LinkedList<Integer> list1 = new LinkedList();
            System.out.println("--------------Create Linked List----------------");
            list1.add(56);
            list1.add(30);
            list1.add(70);
            list1.print();
            System.out.println("\n------After Deleting the first element------");
            list1.pop(56);
            list1.print();
    }
    }
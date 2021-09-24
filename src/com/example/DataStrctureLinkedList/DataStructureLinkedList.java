package com.example.DataStrctureLinkedList;

import javax.xml.crypto.Data;
import java.util.Scanner;

/* linked list learing problem
 * create a node class and perform compute on the linked list
 * create a linked list and put the newnode after given position in the linked list.
 */
public class DataStructureLinkedList {
    Scanner scanner = new Scanner(System.in);
    static Node head;
    //create a node for the linked list
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    // create the add method the give the value linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (this.head == null) {
            head = newNode;
        }
        else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    //create a method to insert neNode after certain position in the linked list
    public void searchInsertNode(int data) {
        Node ptr = head;
        System.out.println("Enter the data need to add");
        Node newNode = new Node(scanner.nextInt());
        //ptr traverse till given node data after that need to inser the newnode in the linkedlist
        while(ptr.data != data)
            {
                ptr = ptr.next;
            }
        //newNode point to ptr.next
        newNode.next = ptr.next;
        ptr.next = newNode;           //ptr.next now point to the newnode
        }
        //display the data to linked list
    public static void display(){
        if(head == null){
            System.out.println("linked list has no value");
        }
        Node node = head;
        while(node.next != null){
            System.out.print("->"+node.data);
            node = node.next;
        }
        if(node.next == null){
            System.out.print("->"+node.data);
        }
    }
    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        //create obejct and give to the method
        DataStructureLinkedList linkedList = new DataStructureLinkedList();
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);
        display();
        System.out.println();
        linkedList.searchInsertNode(30);
        display();

    }
    }

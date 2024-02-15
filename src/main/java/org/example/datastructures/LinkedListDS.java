package org.example.datastructures;


/**
 * This is a Simple Linked List which means that it can only navigate forward
 * Link − Each Link of a linked list can store a data called an element.
 * Next − Each Link of a linked list contain a link to next link called Next.
 * LinkedList − A LinkedList contains the connection link to the first Link called First.
 */

/**
 * Basic operations:
 * Insertion − add an element at the beginning of the list.
 * Deletion − delete an element at the beginning of the list.
 * Display − displaying complete list.
 * Search − search an element using given key.
 * Delete − delete an element using given key.
 */
public class LinkedListDS {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    // Method to insert a new node
    public static LinkedListDS insert(LinkedListDS list, int data) {
        // Create new node with given data
        Node new_node = new Node(data);

        // If the linked list is empty
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }

            // insert the new_node at last node
            last.next = new_node;
        }
        return list;
    }

    // Method to print the linked list
    public static void printList(LinkedListDS list) {
        Node currentNode = list.head;

        System.out.print("Linked List: [");
        while (currentNode != null) {
            // print data at current node
            System.out.print(" " + currentNode.data);

            // go to the next node
            currentNode = currentNode.next;
        }
        System.out.print(" ]");
    }

    // Method to delete a node in the LinkedList by KEY
    public static LinkedListDS deleteByKey(LinkedListDS list, int key) {
        // store head node
        Node currentNode = list.head, prev = null;

        // CASE 1:
        // if head node itself holds the key to be deleted
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next; // changed head

            System.out.println(key + " found and deleted");

            return list;
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedListDS list = new LinkedListDS();

        // Insert the values
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}

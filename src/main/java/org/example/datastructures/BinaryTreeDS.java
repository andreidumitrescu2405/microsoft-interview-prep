package org.example.datastructures;

/**
 * <a href="https://www.youtube.com/watch?v=M6lYob8STMI&t=166">...</a>
 */
public class BinaryTreeDS {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        // if tree doesn't have a root, make the newNode as the root
        if(root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while(true) {
                parent = focusNode;
                if(key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if(focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public static void main(String[] args) {
        BinaryTreeDS binaryTreeDS = new BinaryTreeDS();
        binaryTreeDS.addNode(50, "Boss");
        binaryTreeDS.addNode(25, "Vice Pres");
        binaryTreeDS.addNode(15, "Office Manager");
        binaryTreeDS.addNode(30, "Secretary");
        binaryTreeDS.addNode(75, "Sales Manager");
        binaryTreeDS.addNode(85, "Salesman 1");
    }
}

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return this.name + " has a key " + this.key;
    }
}

package org.example.datastructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode 589. N-ary Tree Preorder Traversal
 * <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/?show=1">...</a>
 * LeetCode 590. N-ary Tree Postorder Traversal
 * <a href="https://leetcode.com/problems/n-ary-tree-postorder-traversal/">...</a>
 */
public class NAryTree {
    public List<Integer> preorder(NodeNAryTree root) {
        LinkedList<NodeNAryTree> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        if(root == null) {
            return result;
        }

        stack.add(root);

        while(!stack.isEmpty()) {
            NodeNAryTree node = stack.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for(NodeNAryTree child : node.children) {
                stack.add(child);
            }
        }
        return result;

    }

    public List<Integer> postorder(NodeNAryTree root) {
        LinkedList<NodeNAryTree> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        if(root == null) {
            return result;
        }

        stack.add(root);

        while(!stack.isEmpty()) {
            NodeNAryTree node = stack.pollLast();
            result.addFirst(node.val);
            for(NodeNAryTree child : node.children) {
                stack.add(child);
            }
        }
        return result;

    }
}
class NodeNAryTree {
    int val;

    List<NodeNAryTree> children;

    public NodeNAryTree() {}

    public NodeNAryTree(int val, List<NodeNAryTree> children) {
        this.val = val;
        this.children = children;
    }
}

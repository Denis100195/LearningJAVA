package QueueStack;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
public class Node {
    public int val;
    public List<Node> neighbors;
    public Node(int val, List<Node> neighbors) {
        this.val = 0;
        this.neighbors = new ArrayList<Node>();
    }
    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

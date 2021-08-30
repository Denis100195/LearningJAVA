package QueueStack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.*/
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Integer, Node> map = new HashMap<>();
        map.put(node.val, new Node(node.val));
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.removeFirst();
            for (Node n : current.neighbors) {
                if (!map.containsKey(n.val)) {
                    map.put(n.val, new Node(n.val));
                    queue.add(n);
                }
                map.get(current.val).neighbors.add(map.get(n.val));
            }
        }
        return map.get(node.val);
    }
}

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BurningTree {
        /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
   private Node createParentMapping(Node root, int target, Map<Node, Node> nodeToParent) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node targetNode = null;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.data == target) {
                targetNode = currentNode;
            }

            if (currentNode.left != null) {
                nodeToParent.put(currentNode.left, currentNode);
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                nodeToParent.put(currentNode.right, currentNode);
                queue.add(currentNode.right);
            }
        }

        return targetNode;
    }

    public static int minTime(Node root, int target) 
    {
       
        Map<Node, Node> nodeToParent = new HashMap<>();
        Solution solution = new Solution();
        Node targetNode = solution.createParentMapping(root, target, nodeToParent);

       
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Boolean> visited = new HashMap<>();

        queue.add(targetNode);
        visited.put(targetNode, true);

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burnt = false;

            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();

               
                if (currentNode.left != null && !visited.getOrDefault(currentNode.left, false)) {
                    queue.add(currentNode.left);
                    visited.put(currentNode.left, true);
                    burnt = true;
                }

               
                if (currentNode.right != null && !visited.getOrDefault(currentNode.right, false)) {
                    queue.add(currentNode.right);
                    visited.put(currentNode.right, true);
                    burnt = true;
                }

               
                if (nodeToParent.containsKey(currentNode) && !visited.getOrDefault(nodeToParent.get(currentNode), false)) {
                    queue.add(nodeToParent.get(currentNode));
                    visited.put(nodeToParent.get(currentNode), true);
                    burnt = true;
                }
            }

            if (burnt) {
                time++;
            }
        }

        return time;
        
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    public ArrayList <Integer> bottomView(Node root) {
       ArrayList<Integer> result = new ArrayList<>();
           if(root == null){
               return result;
           }
           
           Map<Integer, Integer> map = new TreeMap<>();
           
           Queue<Node> queue = new LinkedList<>();
           queue.add(root);
           root.hd =0;
           
            while(!queue.isEmpty()){
                Node temp = queue.poll();
                 map.put(temp.hd, temp.data);
                
                if(temp.left != null){
                   temp.left.hd= temp.hd -1;
                   queue.add(temp.left);
                }
                
                 if(temp.right != null){
                   temp.right.hd=temp.hd+1;
                    queue.add(temp.right);
                }
            }
            for(int value : map.values()){
                result.add(value);
            }
            return result;
       }
}

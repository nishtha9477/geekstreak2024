import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathInUndirectedGraph {
    private List<List<Integer>> graph;
    private void shortestDistance(int src, int[] dist, List<List<Integer>> graph){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src); dist[src] = 0;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            for(int neighbor : graph.get(node)){
                if(dist[node] + 1 < dist[neighbor]){
                    dist[neighbor] = dist[node] + 1;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        graph = new ArrayList<>(n);
        for(int i =0; i<n; i++) graph.add(new ArrayList<>());
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]); graph.get(edge[1]).add(edge[0]);
            }
            int[]dist = new int[n]; Arrays.fill(dist, Integer.MAX_VALUE);
            shortestDistance(src, dist, graph);
            for(int i = 0; i<n; i++){
                if(dist[i] == Integer.MAX_VALUE) dist[i] = -1;
            }
            return dist;
        }
        
    }


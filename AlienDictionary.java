import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AlienDictionary {
     private final Map<Character, Set<Character>> graph = new HashMap<>();
    private final Map<Character,Integer> indegree = new HashMap<>();
     
    public String findOrder(String[] dict, int n, int k) {
        for(int i = 0; i<k; i++){
            char c = (char) ('a' + i);
            graph.put(c, new HashSet<>());
            indegree.put(c, 0);
         }
         for(int i = 0; i<n-1; i++){
             String word1 = dict[i], word2 = dict[i + 1];
              int len = Math.min(word1.length(), word2.length());
              
              for(int j =0; j<len; j++){
                  char parent = word1.charAt(j), child = word2.charAt(j);
                  if(parent !=child){
                      if(!graph.get(parent).contains(child)){
                          graph.get(parent).add(child);
                          indegree.put(child, indegree.get(child) + 1);
                      }
                      break;
                  }
              }
         }
         Queue<Character> queue = new LinkedList<>();
         for(char c : indegree.keySet()){
             if(indegree.get(c) == 0) queue.add(c);
              }
         StringBuilder order = new StringBuilder();
         while(!queue.isEmpty()){
             char current = queue.poll();
             order.append(current);
             
             for(char neighbor : graph.get(current)){
                 indegree.put(neighbor, indegree.get(neighbor) - 1);
                 if(indegree.get(neighbor) == 0) queue.add(neighbor);
             }
         }
         if(order.length() != k) return "";
         private final Map<Character, Set<Character>> graph = new HashMap<>();
         private final Map<Character,Integer> indegree = new HashMap<>();
          
         public String findOrder(String[] dict, int n, int k) {
             for(int i = 0; i<k; i++){
                 char c = (char) ('a' + i);
                 graph.put(c, new HashSet<>());
                 indegree.put(c, 0);
              }
              for(int i = 0; i<n-1; i++){
                  String word1 = dict[i], word2 = dict[i + 1];
                   int len = Math.min(word1.length(), word2.length());
                   
                   for(int j =0; j<len; j++){
                       char parent = word1.charAt(j), child = word2.charAt(j);
                       if(parent !=child){
                           if(!graph.get(parent).contains(child)){
                               graph.get(parent).add(child);
                               indegree.put(child, indegree.get(child) + 1);
                           }
                           break;
                       }
                   }
              }
              Queue<Character> queue = new LinkedList<>();
              for(char c : indegree.keySet()){
                  if(indegree.get(c) == 0) queue.add(c);
                   }
              StringBuilder order = new StringBuilder();
              while(!queue.isEmpty()){
                  char current = queue.poll();
                  order.append(current);
                  
                  for(char neighbor : graph.get(current)){
                      indegree.put(neighbor, indegree.get(neighbor) - 1);
                      if(indegree.get(neighbor) == 0) queue.add(neighbor);
                  }
              }
              if(order.length() != k) return "";
              return order.toString();
       }
     }         return order.toString();
  }


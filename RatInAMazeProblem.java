import java.util.*;
public class RatInAMazeProblem{
     protected ArrayList<String> solve(int mat[][], int [][]vis, int i,int j){
            ArrayList<String> res= new ArrayList<>();
            if(i<0 || j<0 || i>=vis.length || j>=vis[0].length || vis[i][j] == 1|| mat[i][j]==0){
                res.add("x");
                return res;
            }
            if(i==vis.length-1 && j==vis.length-1){
                res.add("");
                return res;
            }
            vis[i][j]=1;
            ArrayList<String> r= solve(mat, vis, i,j+1);
            ArrayList<String> l= solve(mat, vis, i,j-1);
            ArrayList<String> u= solve(mat, vis, i-1,j);
            ArrayList<String> d= solve(mat, vis, i+1,j);
            vis[i][j]=0;
            
            if(!l.contains("x")){
                addToList(l, res, "L");
            }
            if(!r.contains("x")){
                addToList(r, res, "R");
             }
            if(!u.contains("x")){
                addToList(u, res, "U");
             }
            if(!d.contains("x")){
                addToList(d, res, "D");
             }
            if(res.isEmpty()){
                 res.add("x");
              }
              return res;
        }
        protected void addToList(ArrayList<String> src, ArrayList<String> dest, String Str){
            for(String s: src){
                dest.add(Str+s);
            }
        }
        
        public ArrayList<String> findPath(int[][] mat) {
            // Your code here
            if(mat[0][0]==0) return new ArrayList<>();
            ArrayList<String> res= solve(mat, new int[mat.length][mat.length],0,0);
            
            if(res.contains("x")){
                return new ArrayList<>();
            }
            return res;
        }
    
}

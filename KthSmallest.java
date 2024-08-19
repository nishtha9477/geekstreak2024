import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : arr){
            pq.add(val);
            if(pq.size() > k) pq.poll();
        }
        return pq.poll();
    }
}

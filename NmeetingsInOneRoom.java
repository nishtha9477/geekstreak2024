import java.util.Arrays;
import java.util.Comparator;

public class NmeetingsInOneRoom {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int meeting[][]= new int[n][2];
        for(int i=0; i<n; i++){
            meeting[i][0]=start[i];
             meeting[i][1]=end[i];
        }
        Arrays.sort(meeting, Comparator.comparingInt(o -> o[1]));
        int count =1;
        int st=meeting [0][0];
         int et=meeting [0][1];
         for(int i=1; i<n; i++){
             if(meeting[i][0]>et){
                 st=meeting[i][0];
                 et=meeting[i][1];
                 count++;
             }
         }
         return count;
    }
}

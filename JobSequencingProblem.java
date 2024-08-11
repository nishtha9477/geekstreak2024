import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, new Comparator<Job>(){
            @Override
            public int compare(Job a, Job b){
                return Integer.compare(b.profit, a.profit);
            }
        });
        int deadline=0;
        for(Job a:arr){
            deadline = Math.max(deadline, a.deadline);
        }
        int maxProfit=0;
        int numJobs=0;
        int []num=new int [deadline+1];
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline; j>0;j--){
                if(num[j]==0){
                    maxProfit+=arr[i].profit;
                    numJobs++;
                    num[j]=-1;
                    break;
                }
            }
        }
        return new int []{numJobs, maxProfit};
    }
}

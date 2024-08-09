import java.util.Arrays;
public class MaximizeArrayValueAfteRearrangement {
    int Maximize(int arr[]) {
        // Complete the function
        int n= arr.length;
        int mod = 1000000007;
        
        Arrays.sort(arr);
        long result = 0;
        for(int i =0; i<n; i++){
            result =(result + (long)arr[i]*i)% mod;
        }
        return (int) result;
    }

}

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[]) {
       
        long temp = 1, count = 0;
        int n = nums.length, idx = -1;
        for( int i=0; i<n; i++){
            if(nums[i] !=0){
                temp = temp * nums[i];
            }else{
                count++;
                idx = i;
            }
        }
        long ans[] = new long[n];
        if(count>1) return ans;
        if(count == 1){
            ans[idx] = temp;
            return ans;
        }
        for(int i=0; i<n; i++){
            ans[i] = temp / nums[i];
        }
        return ans;
    }
}

public class SplitArrayIntoTwoSubarray {
    public boolean canSplit(int arr[]) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int sumNew = 0;
        for(int i = 0; i<arr.length; i++){
            sumNew +=arr[i];
            sum -= arr[i];
            if(sumNew == sum) return true;
        }
        return false;
    }
}

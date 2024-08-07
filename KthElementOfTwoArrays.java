public class KthElementOfTwoArrays {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n = arr1.length;
        int m = arr2.length;
        
        int[] arr3 = new int[n+m];
        int i = 0, j=0, p=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                arr3[p++] =arr1[i++];
            }
            else{
                arr3[p++] = arr2[j++];
            }
        }
        while(i<n){
            arr3[p++] = arr1[i++];
        }
        
         while(j<m){
            arr3[p++] = arr2[j++];
        }
       return arr3[k-1]; 
    }
}


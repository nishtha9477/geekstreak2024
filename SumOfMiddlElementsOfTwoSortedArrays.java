public class SumOfMiddlElementsOfTwoSortedArrays {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
    
        int n=arr1.length;
        int m=arr2.length;
        int merged[]=new int[n+m];
        int i=0,j=0,k=0;
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }else{
                 merged[k++]=arr2[j++];
            }
        }
        while(i<n){
           merged[k++]=arr1[i++]; 
        }
        while(j<m){
           merged[k++]=arr2[j++]; 
        }
        return merged[(n+m)/2] + merged[(n+m)/2 -1];
    }
}

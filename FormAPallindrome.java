
public class FormAPallindrome {
    static int countMin(String str)
        {
            int n=str.length();
            int a[][]=new int[n][n];
            for(int i=0; i<n; i++){
                a[i][i]=1;
            }
            for(int length=2; length<=n; length++){
                for(int i=0; i<n-length+1; i++){
                    int j=i+length-1;
                    if(str.charAt(i)==str.charAt(j)){
                        a[i][j]=a[i+1][j-1]+2;
                    }else{
                        a[i][j]=Math.max(a[i+1][j], a[i][j-1]);
                    }
                }
            }
           int s= a[0][n-1];
           return n-s;
        }
    
}

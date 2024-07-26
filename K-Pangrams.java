class Solution {
    boolean kPangram(String str, int k) {
        int[] mark= new int[26];
        int sum=0;
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('a'<=ch && ch<='z'){
                int index=ch-'a';
                mark[index]=1;
            }
            if(ch==' '){
                count=count+1;
            }
        }
        
        for(int i=0; i<26; i++){
            if(mark[i]==1){
                sum+=1;
            }
        }
        
        if(sum==26){
            return true;
        }
        else if((26-sum)<=k && (str.length()-count)>=26){
            return true;
        }
        return false;
    }
}
public class ValidateAnIPAddress {
    public boolean isValid(String str) {
        
        String []segments= str.split("\\.");
         if(segments.length != 4){
             return false;
         }
         for(String segment: segments){
             if(segment.isEmpty() || !segment.matches("[0-9]+")){
                 return false;
             }
             int num = Integer.parseInt(segment);
             if(num<0|| num>255){
                return false; 
             }
             
            if(!segment.equals("0")&& segment.startsWith("0")) {
                return false;
            }    
                 
        }
        return true;
      
    }
    
}

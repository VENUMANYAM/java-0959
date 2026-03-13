class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb= new StringBuilder();
        for(char ch:s.toCharArray()){
           if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
           } 
        }
         String clean=sb.toString();
         int left=0;
         int right=clean.length()-1;
         while(left<right){
            if(clean.charAt(left)!=clean.charAt(right)){
                return false;
            }
            left++;
            right--;
         }
       
         return true;
    }
}
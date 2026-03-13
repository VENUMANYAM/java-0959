class Solution {
    public int hammingWeight(int n) {
       int rev=0;
       while(n!=0){
        n=n&(n-1);
        rev++;
       }
       return rev;
    }
}
//retunr Integer.bitcode(n);
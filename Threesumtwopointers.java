// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Threesumtwopointers {
    public static void main(String[] args) {
    int arr[] ={1,-2,1,2,1,-3,2,1};
    int sum=0;
    Arrays.sort(arr);
    ArrayList<ArrayList<Integer>> AR= new ArrayList<>();
   for(int i=0;i<arr.length-2;i++){
       int left=i+1;
       int right=arr.length-1;
       while(left<right){
            sum=arr[left]+arr[right]+arr[i];
      
        if(sum==0){
         ArrayList<Integer> temp = new ArrayList<>();
         temp.add(arr[i]);
            temp.add(arr[left]);
            temp.add(arr[right]);
            AR.add(temp);
            left++;
            right--;
            while(left<right&&arr[left]==arr[left-1])
            left++;
            while(left<right&&arr[right]==arr[right+1])
            right--;
        }
        else if(sum<0){
            left++;
            
        }else{
            right--;
        }
           
   }
    }
    System.out.println(AR);
    
}
}
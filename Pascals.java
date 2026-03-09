import java.util.ArrayList;

public class Pascals{
    
    public static ArrayList<ArrayList<Integer>> fun (int n)
   {
     ArrayList<ArrayList<Integer>> AR= new ArrayList<>();
     ArrayList<Integer> first=new ArrayList<>();
   first.add(1);
    AR.add(first);
     for(int i=1;i<n;i++){
          ArrayList<Integer> temp=new ArrayList<>();
          temp.add(1);
          for(int j=1;j<i;j++){
              int val=AR.get(i-1).get(j)+AR.get(i-1).get(j-1);
              temp.add(val);
          }
          temp.add(1);
         
         AR.add(temp);  
     }
    return AR; 
   }
     public static void main(String[] args) {
         
        System.out.println(fun(5));
    }
}
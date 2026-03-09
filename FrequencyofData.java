
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyofData {
public static void main(String[] args) {
    
   int[] array={1,2,3,4,5,3,2,5,6,7,5,32,1,1,2,4,2,2};
    
   HashMap<Integer ,Integer> map = new HashMap<>();
   ArrayList<Integer> list= new ArrayList<>();
   int k=5;
   // for(int n:array){
   //   if(map.containsKey(n)){
   //     int value= map.get(n);
   //      map.put(n,value+1);
   //   }else{
   //      map.put(n,1);
   //   }
   //  }
   for(int n:array){
   map.put(n,map.getOrDefault(n,0)+1);
   }

   int freq= map.get(k);
   for(Map.Entry <Integer,Integer> entry:map.entrySet()){ 
    if(entry.getValue()==freq){
        list.add(entry.getKey());
       
    }
    // System.out.println(entry.getKey()+"-"+entry.getValue());
   }
   System.out.println(list);
   for(Integer element:list){
   System.out.println(element+" ->"+map.get(element));
   }
}}



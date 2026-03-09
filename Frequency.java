import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] array={1,2,3,4,32,1,4,7,4,2,1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int n:array){
            if(map.containsKey(n)){
                int value=map.get(n);
                map.put(n, value+1);
            }else{
                map.put(n, 1); 
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}










import java.util.*;

class Venu{
    
    public static class FrequencyDayStructure{
        public static void main(int[] array) {
            
        }
    int[] array;
    public Map<Integer,Integer>FrequencyMap;
    public FrequencyDayStructure(int[] a){
        this.array=a;
        this.FrequencyMap=new HashMap<>();
        for(int num:a){
            FrequencyMap.put(num,FrequencyMap.getOrDefault(num,0)+1);
        }
    }
    public List<Integer>getElementWithExtraFrequecy(int v){
        List<Integer> result = new ArrayList<>();
            for(int num:array){
                if(FrequencyMap.get(num)== v){
            
            result.add(num);
                }
            
        }
    
    return result;
}
public static void main(String[] args) {
    int[] a={1,1,3,5,7,2,5,5,1};
    
  FrequencyDayStructure  D=new FrequencyDayStructure(a);
    Scanner sc = new Scanner(System.in);
    System.out.println("list frequency nums");
    int freq=sc.nextInt();
    List<Integer>output=D.getElementWithExtraFrequecy(freq);
    System.out.println(output);

}
}
}

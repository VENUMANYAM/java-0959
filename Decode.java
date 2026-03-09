import java.util.*;
public class Decode {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       System.out.println("output:");
      String key=sc.nextLine();
       System.out.println("output:");
      String message=sc.nextLine();
       HashMap<Character,Character>map=new HashMap<>();
           int temp=97;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' '&&!map.containsKey(c)){
                map.put(c,(char)temp);
                temp++;
                            }
        }
          String ans="";
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch!=' '){
           ans += map.get(ch);
            }else{
                ans+=' ';           }
        }   
    System.out.println(ans);
    }
} 

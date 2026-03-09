import java.util.*;

class Threesum {
    public static void main(String[] args) {

        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;

        for(int i = 0; i < n-2; i++){

            HashSet<Integer> set = new HashSet<>();

            for(int j = i+1; j < n; j++){

                int c = -(arr[i] + arr[j]);

                if(set.contains(c)){
                    System.out.println(arr[i] + " " + arr[j] + " " + c);
                }

                set.add(arr[j]);
            }
        }
    }
}
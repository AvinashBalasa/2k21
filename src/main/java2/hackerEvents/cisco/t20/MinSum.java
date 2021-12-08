package hackerEvents.cisco.t20;

import java.util.*;
import java.util.stream.Collectors;

public class MinSum {

    public static void main(String args[]){
       List<Integer> list = new ArrayList<Integer>();

        Random rd = new Random(); // creating Random object

        for (int i = 0; i < 10; i++) {
            list.add( rd.nextInt(10)); // storing random integers in an array

        }
        System.out.println(minSum(list, 3));
    }


    public static int minSum(List<Integer> num, int k) {
        int k0=0;
        System.out.println(num);
        while(k0<k){
           Integer a = Collections.max(num);
           int j= num.indexOf(a);
            double d = Math.ceil((double)a/2);
            num.set(j, (int) d);
            k0++;
        }
        System.out.println(num);
        return num.stream().collect(Collectors.summingInt(Integer::intValue));

       /* int k0=0;
        int[] a= num.stream().
            mapToInt(Integer::intValue).
            toArray();
        while(k0<k){
        float max=0;
        int j=0;
        for(int i=0; i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                j=i;
            }
        }
        a[j]= (int)Math.ceil(max/2);
        k0++;
    }
        return Arrays.stream(a).sum();*/
    }


}

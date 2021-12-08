package hackerEvents;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Mojo {
    volatile static int j=0;
    public static void main(String[] args) {
     int[] a = new int[]{1,2,3,4};
     int[] b = new int[]{5,2,3,7};
     long startTime =  System.nanoTime();
     System.out.println(solve(4,a,b));
     long endTime = System.nanoTime();
     long duration = endTime -startTime;
        System.out.format("nano sec = %s, ( S_Start : %s, S_End : %s ) \n", (duration/1000), startTime, endTime );

    }

    static long solve(int n, int[] A, int[] B){
       long l=0l;
       List<Integer> al = new ArrayList<>(n);
       for(int i=0;i<n;i++){
           al.add(i,A[i]);
       }
        List<Integer> bl = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            bl.add(i,B[i]);
        }

        HashSet<List<Integer>> finalList = new HashSet<>();
        HashSet<List<Integer>> finalListb = new HashSet<>();
        finalList.add(al);
        finalListb.add(bl);
        for(int i=0;i<n-1;i++){

            finalList.addAll(mySwap(i,n,al));
            finalListb.addAll(mySwap(i,n,bl));
        }


        l=calSum(n,bestOflist(finalList),bestOflist(finalListb));


        return l;
    }

    static List<Integer> bestOflist(HashSet<List<Integer>> x){

        int MAXSUM=0;
        List<Integer> reqList = new ArrayList<>();
        for (List<Integer> x1:x) {
            int sum =0;
            for (int i=0;i<x1.size();i++) {
                sum= sum + i*x1.get(i);
            }

            if(sum>MAXSUM){
                reqList.clear();
                reqList.addAll(x1);
                MAXSUM = sum;
            }
        }

        return reqList;
    }
    static long calSum(int n, List<Integer> A, List<Integer> B){
        long l=0l;
        for(int i=0; i< n; i++){
            l = l+ A.get(i)*B.get(i)*(i+1);
        }
        return l;
    }

    static HashSet<List<Integer>> mySwap(int start, int n, List<Integer> A){
        HashSet<List<Integer>> myset = new HashSet<>();

        List<Integer> k = new ArrayList<>();
        k.addAll(A);
        for(int i=start;i<n-1;i=i+2){
            List<Integer> m = new ArrayList<>();

            if(k.get(i)>k.get(i+1)) {
                int temp = k.get(i);
                k.set(i, k.get(i + 1));
                k.set(i + 1, temp);
                m.addAll(k);
                myset.add(m);
            }

        }
        return myset;
    }
}

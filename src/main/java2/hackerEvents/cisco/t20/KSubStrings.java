package hackerEvents.cisco.t20;

import java.util.*;

public class KSubStrings {
    public static void main(String[] args) {
        perfectSubstring("1112200",2);
    }

    public static int perfectSubstring(String s, int k) {

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(s.substring(i,i+1));
        }
        for(int a:arr){
            System.out.println(a+ " ");
        }

        List<List<Integer>> listOfUniqueList = new ArrayList<List<Integer>>();

        // iterate on 1st position in list, start at 0
        for (int outPointer=0; outPointer<arr.length; outPointer++) {

            // iterate on liste size, start on full list and then decrease size
            for (int currentPointer=arr.length-outPointer; currentPointer>0; currentPointer--) {

                //initialize current list.
                //int[] temp= new int[currentPointer];
                List<Integer> temp = new ArrayList<Integer>();
                // iterate on each (corresponding) int of global list
                int i = 0;
                while (i<currentPointer) {
                    temp.add(arr[outPointer+i]);
                    i++;
                }
                if (!listOfUniqueList.contains(temp) ){
                    listOfUniqueList.add(temp);
                } else {
                    continue;
                }
            }

        }
        System.out.println("list retrieved: " + listOfUniqueList);
        System.out.println("size of list retrieved: " + listOfUniqueList.size());
        int count=0;
        BAYATA:
        for(List each:listOfUniqueList){
            boolean flag=false;
            int[] a = new int[each.size()];
            for(int i=0;i<each.size();i++){
                a[i]= (int) each.get(i);
            }

            Map<Integer,Integer> check = new HashMap<>();
            INNER:
            for(int i=0;i<a.length;i++){
                if(!check.containsKey(a[i]))
                    check.put(a[i],1);
                else {
                    int value= check.get(a[i]);
                    if(value<k)
                        check.put(a[i], value+ 1);
                    else {
                        System.out.println("hi");
                        break BAYATA;
                    }
                }
            }
            for (int x:check.values()) {
                if(x!=k) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                count++;
        }
        System.out.println(count);
        return count;
    }
}

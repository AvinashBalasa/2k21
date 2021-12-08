package hackerEvents.fabella;

import java.util.*;
import java.util.stream.LongStream;

public class DistinctSubArrays {
    public static void main(String[] args) {

        Long[] A = new Long[]{1L,2L,1L,2L};

        System.out.println("global list to study: " + A);
        int count=0;
        // iterate on 1st position in list, start at 0
        for (int outPointer=0; outPointer<A.length; outPointer++) {

            // iterate on liste size, start on full list and then decrease size
            for (int currentPointer=A.length-outPointer; currentPointer>0; currentPointer--) {

                //initialize current list.
                //List<Long> tempList = new ArrayList<Long>();
                Long[] temp= new Long[currentPointer];
                // iterate on each (corresponding) int of global list
                int i = 0;
                while (i<currentPointer) {
                    temp[i]=A[outPointer+i];
                    i++;
                }
                Long sum=0L;
                for (Long j : temp)
                    sum += j;

                if ( sum>= 3){ //sum of elements of subarrays with sum >3
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println("size of list retrieved: " + count);
    }

/*
public class DistinctSubArrays {
    public static void main(String[] args) {

        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(2);

        System.out.println("global list to study: " + A);

        //global list
        List<List<Integer>> listOfUniqueList = new ArrayList<List<Integer>>();

        // iterate on 1st position in list, start at 0
        for (int initialPos=0; initialPos<A.size(); initialPos++) {

            // iterate on liste size, start on full list and then decrease size
            for (int currentListSize=A.size()-initialPos; currentListSize>0; currentListSize--) {

                //initialize current list.
                List<Integer> currentList = new ArrayList<Integer>();

                // iterate on each (corresponding) int of global list
                for ( int i = 0; i<currentListSize; i++) {
                    currentList.add(A.get(initialPos+i));
                }
                Integer sum = currentList.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
                // insure unicity
                if (!listOfUniqueList.contains(currentList) && sum>=4){
                    listOfUniqueList.add(currentList);
                } else {
                    continue;
                }
            }
        }

        System.out.println("list retrieved: " + listOfUniqueList);
        System.out.println("size of list retrieved: " + listOfUniqueList.size());
    }

}
 */
}

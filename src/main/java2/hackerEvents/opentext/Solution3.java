package hackerEvents.opentext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution3 {
    /*
Write a function that, given an array A of N integers returns the maximum sum of two numbers whose digits add up to an equal sum.
 If there are no two numbers whose digits have an equal sum the function should return -1.

 test cases:

51,71,17,42 returnNum=93. 51 and 42(5+1= 6 4+2 = 6, 51+42=93) 17 and 71 have equal sums but the number is 88

42,33,60 returnNum=102 all add up to 6, but 60+42 =102

51,32,43 none are equal sum so return -1
 */
    public static void main(String a[])
    {
        int[] A = {42,71,17,51,60,91,82};

        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int maxSum = -1;
        int sumEq = 0;
        HashMap<Integer, Integer> criticalNumbers = new HashMap<>();

        if(A.length>200000 || A.length <1)
            return -1;
        List<Integer> intList = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
        if(intList.get(0) < 1 || intList.get(intList.size()-1) > 1000000000)
            return -1;

        for (int a : A) {
            sumEq = sumEq(a);
            Integer overallBigForSumEq = criticalNumbers.get(sumEq);
            if (overallBigForSumEq == null) {
                criticalNumbers.put(sumEq, a);
            } else {
                int sum = a + overallBigForSumEq;
                if (overallBigForSumEq < a) {
                    criticalNumbers.replace(sumEq, a);
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    static int sumEq(int N){
        int s=0;
        while(N !=0){
            s = s + N%10;
            N = N /10;
        }
        return s;
    }
}

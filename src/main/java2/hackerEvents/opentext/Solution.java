package hackerEvents.opentext;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
class Solution {
    public static void main(String a[])
    {
        int[] A = {1,9,8,7,6,4,2,3};
        int B[]= {-7,-5,-9};
        int C[] ={1,-2,3};
        int D[] ={1,2,3};
        int E[] = {-1};
        int F[] = {0};
        int G[] = {-1000000};
        System.out.println(solution(F));
    }
    public static int solution(int[] A) {
        /*int j=0;
        if(A.length < 1 || A.length > 100000) return -1;
        List<Integer> intList = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
        if(intList.get(0) < -1000000 || intList.get(intList.size()-1) > 1000000) return -1;
        if(intList.get(intList.size()-1) < 0) return 1;
        int count=0;
        for(int i=1; i<=intList.size();i++)
        {
            if(!intList.contains(i))return i;
            count++;
        }
        if(count==intList.size()) return ++count; //0% performance
        return -1;*/
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i; //100% performance
            }
        }
        return -1;
    }
}


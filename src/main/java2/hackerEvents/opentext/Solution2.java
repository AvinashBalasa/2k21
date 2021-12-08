package hackerEvents.opentext;

public class Solution2 {
    public static void main(String a[])
    {
        // next number that gives same sumEq

        System.out.println(solution(230));
    }
    public static int solution(int N) {

        int reqSum = sumEq(N);

        for (int i=N+9;i<50000;i++){
            if(sumEq(i)==reqSum){
                return i;
            }
        }

        return -1;
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

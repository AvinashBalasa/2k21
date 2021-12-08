package hackerEvents.wissen;

public class DiffOfMedicine {

    public static void main(String[] args) {
        int N = 3;
       // int[][] input ={ {3,9},{5,7},{4,6},{8,1},{7,5}};
        int[][] input ={ {2,1},{3,4},{5,7}};

        long out = solve(N, input);
        System.out.println(out+ " diff is this");
    }

    static long solve(int n, int[][] s){

        long diff=0;
        int i=0,j=n-1;
        long A = s[i][0];
        long B = s[j][1];
        int downwardCursor=1;
        int updwardCursor=1;

        while(i<=j){
            if(A<=B){

                if(downwardCursor==1){
                    A = A + s[i][1];
                }
                if(downwardCursor%2==0 && downwardCursor!=1) {
                    if (s[i][0] < s[i][1]) {
                        A = A + s[i][1];
                    } else {
                        A = A + s[i][0];
                    }
                }else if(downwardCursor%2==1 && downwardCursor!=1){
                    if (s[i][0] < s[i][1]) {
                        A = A + s[i][0];
                    } else {
                        A = A + s[i][1];
                    }
                }
                downwardCursor++;
                if(downwardCursor%2==0){
                    i++;
                }
            }
            else{

                if(updwardCursor==1){
                    B = B + s[j][0];
                }
                if(updwardCursor%2==0 && updwardCursor!=1) {
                    if (s[j][0] < s[j][1]) {
                        B = B + s[j][1];
                    } else {
                        B = B + s[j][0];
                    }
                }else if(updwardCursor%2==1 && updwardCursor!=1){
                    if (s[j][0] < s[j][1]) {
                        B = B + s[j][0];
                    } else {
                        B = B + s[j][1];
                    }
                }
                updwardCursor++;
                if(updwardCursor%2==0){
                    j--;
                }
            }
        }
        diff= A-B;
        if(diff<0)
            return diff*-1;
        else
            return diff;
    }
}

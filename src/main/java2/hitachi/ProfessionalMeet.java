package hitachi;

import java.util.*;

public class ProfessionalMeet {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,3,1,2,1};
        //System.out.println(a[0]);
        System.out.println(walk_talk(a.length,a));
    }

    static int walk_talk(int N, int[] A){

        List<Integer> timesTaken = new ArrayList<Integer>();
        Map<Integer, PositionOfProf> fl = new HashMap<Integer, PositionOfProf>();
        if(A.length==0){
            return 0;
        }
        for(int i=0; i<N; i++){
            PositionOfProf positionOfProf = new PositionOfProf();
            if(fl.containsKey(A[i])){

                positionOfProf.setLast(i);
                positionOfProf.setFirst(fl.get(A[i]).getFirst());
                fl.put(A[i],positionOfProf);
            }else{

                positionOfProf.setFirst(i);
                fl.put(A[i],positionOfProf);
            }

        }

        for(PositionOfProf a: fl.values()){
            if(a.getLast() - a.getFirst() >0 && (a.getLast() - a.getFirst())%2 ==0 ){
                timesTaken.add((a.getLast() - a.getFirst())/2);
            }else if(a.getLast() - a.getFirst() >0 && (a.getLast() - a.getFirst())%2 ==1 ){
                timesTaken.add((a.getLast() - a.getFirst())/2 +1);
            }
        }

        return Collections.max(timesTaken);
    }
    static class PositionOfProf{
        int first;
        int last;

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getLast() {
            return last;
        }

        public void setLast(int last) {
            this.last = last;
        }
    }
}
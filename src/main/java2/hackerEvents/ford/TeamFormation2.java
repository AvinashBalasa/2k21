package hackerEvents.ford;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamFormation2 {

    public static void main(String[] args) {

        List<Integer> skills = new ArrayList<>();
        skills.add(12);
        skills.add(4);
        skills.add(6);
        skills.add(2);
        skills.add(13);
        skills.add(10);
        skills.add(5);
        //System.out.println(countTeams(skills, 3, 4, 10));
        countTeams(skills, 3, 4, 10);
    }


    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        // Write your code here

        int count = 0;
        List<Integer> okSkills = skills.stream().filter(x -> x <= maxLevel && x >= minLevel).collect(Collectors.toList());
        okSkills.forEach(System.out::println);
        printCombination(okSkills.stream().mapToInt(i->i).toArray(),okSkills.size(),3);
        return count;
    }

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
}

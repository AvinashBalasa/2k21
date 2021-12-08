package leet.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ShuffleString {

    public static void main(String[] args) {
        String s = new String("acdbfge");
        int[] i = new int[]{0, 2, 3, 1, 5, 6, 4};
        ShuffleString shuffleString = new ShuffleString();
        System.out.println(shuffleString.restoreString(s, i));
    }

    public String restoreString(String s, int[] indices) {

        char[] arr = s.toCharArray();
        char[] result = new char[s.length()];

        for(int i=0;i<indices.length;i++)
            result[indices[i]]=arr[i];

        return String.valueOf(result);
    }

    /*#
    char[] arr = s.toCharArray();
    char[] result = new char[s.length()];

        for(int i=0;i<indices.length;i++)
    result[indices[i]]=arr[i];

        return String.valueOf(result);
        #*/

   /* 2#
    char[] array1 = new char[s.length()];
    Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
        map.put(indices[i], s.charAt(i));
    }

        for (int i = 0; i < array1.length; i++) {
        array1[i] = map.get(i);
    }

        return String.valueOf(array1);*/

}

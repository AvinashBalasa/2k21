package codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ISpyOnYou {

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        String input = "orzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf " +
                "jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh" +
                "zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgforzaa my name isza avinazashza zaooh asjkza fhasdzj adsjfhzjzhljkahsf \" +\n" +
                "                \"jhzkjlhasfhzlzjhalksdz kahlkahlkzzklzhakl alkjzklhalkfjhaslkfhzlkzjhklajhsf lkajhzklfsdlkasklfhalkz kljahh\" +\n" +
                "                \"zjkljhafslkdfjhlkfshdlkahsdfhzkzhfkasdlgzlkfa alksdzlkalgf";
        char[] str = new char[input.length()];
        char[] c = input.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i]!='z'){
                str[i]=c[i];
            } else
                i=i+1;

        }

        long t2 = (System.nanoTime() - t1);

        System.out.println(String.valueOf(str) +"\nCompleted in "+ t2 );
    }
}

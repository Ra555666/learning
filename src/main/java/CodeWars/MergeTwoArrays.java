package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MergeTwoArrays {
    public int[] mergeRemoveDupSortIt(int[] a, int[] b) {
        int[] merged = IntStream
                .concat(IntStream.of(a), IntStream.of(b))
                .distinct()
                .sorted()
                .toArray();
        return merged;
    }
}


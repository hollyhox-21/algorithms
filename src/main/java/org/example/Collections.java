package org.example;

import java.util.Comparator;
import java.util.List;

public class Collections {
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        if (list == null || list.isEmpty()) return -1;
        return binarySearch(list, key, 0, list.size() - 1, c);
    }

    private static <T> int binarySearch(List<T> list, T key, int leftIdx, int rightIdx, Comparator<? super T> c) {
        while (leftIdx <= rightIdx) {
            int mid = leftIdx + (rightIdx - leftIdx) / 2;
            T current = list.get(mid);

            int cmp = c.compare(current, key);
            if (cmp == 0) return mid;
            else if (cmp < 0) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }
}

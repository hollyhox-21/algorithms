package org.example;

import java.util.Comparator;

public class Arrays {
    static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex);
    }

    private static int binarySearch(byte[] a, byte key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            byte current = a[mid];

            if (current == key) return mid;
            else if (current < key) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    static int binarySearch(char[] a, char key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex);
    }

    private static int binarySearch(char[] a, char key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            char current = a[mid];

            if (current == key) return mid;
            else if (current < key) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    static int binarySearch(double[] a, double key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex);
    }

    private static int binarySearch(double[] a, double key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            double current = a[mid];

            if (current == key) return mid;
            else if (current < key) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    static int binarySearch(float[] a, float key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex);
    }

    private static int binarySearch(float[] a, float key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            float current = a[mid];

            if (current == key) return mid;
            else if (current < key) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    static int binarySearch(long[] a, long key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex);
    }

    private static int binarySearch(long[] a, long key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            long current = a[mid];

            if (current == key) return mid;
            else if (current < key) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    static int binarySearch(short[] a, short key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex);
    }

    private static int binarySearch(short[] a, short key, int leftIdx, int rightIdx) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            short current = a[mid];

            if (current == key) return mid;
            else if (current < key) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    static int binarySearch(int[] a, int key) {
        return binarySearch(a, key, 0, a.length - 1);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        while (fromIndex <= toIndex) {
            int mid = (fromIndex + toIndex) / 2;
            int current = a[mid];

            if (current == key) return mid;
            else if (current < key) fromIndex = mid + 1;
            else toIndex = mid - 1;
        }

        return -1;

    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, key, 0, a.length - 1, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (!validateIndexes(fromIndex, toIndex, a.length)) return -1;
        return binarySearch(a, key, fromIndex, toIndex, c);
    }

    private static <T> int binarySearch(T[] a, T key, int leftIdx, int rightIdx, Comparator<? super T> c) {
        while (leftIdx <= rightIdx) {
            int mid = (leftIdx + rightIdx) / 2;
            T current = a[mid];

            int cmp = c.compare(current, key);
            if (cmp == 0) return mid;
            else if (cmp < 0) leftIdx = mid + 1;
            else rightIdx = mid - 1;
        }

        return -1;
    }

    private static boolean validateIndexes(int leftIdx, int rightIdx, int len) {
        return leftIdx < rightIdx && rightIdx < len;
    }
}



package sort;

public class BinarySearch {

    public int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length -1;
        int m;

        while (l <= r) {
            m = l + ((r - l)/2);

            if (arr[m] == target) {
                return m;
            }

            if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}

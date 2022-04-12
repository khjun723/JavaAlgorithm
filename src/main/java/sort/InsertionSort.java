package sort;

public class InsertionSort implements ISort{
    // 안정 정렬
    // 인플레이스 정렬
    @Override
    public void sort(int[] arr) {
        //[ 3 | 1  2  4  0]
        //[       |        ]
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 삽입 위치를 찾아줄 데이터
            int j = i - 1; // 0 - j 정렬된 서브 리스트
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

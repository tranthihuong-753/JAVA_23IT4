/*
Bài tập 38. Viết chương trình Java để tạo interface Sortable với phương thức sort() sắp xếp một mảng các số nguyên theo thứ tự tăng dần. Tạo hai lớp BubbleSort và SelectionSort triển khai interface Sortable và goi các triển khai phương thức sort() của riêng chúng
 */
package javatuan10;

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

public class bai38 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Mảng sau khi sắp xếp bằng BubbleSort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Mảng sau khi sắp xếp bằng SelectionSort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

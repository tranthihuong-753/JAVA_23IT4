/*
Viết chương trình Java để tạo  interface Sortable với phương thức sort (int[] array) để sắp xếp một mảng các số nguyên 
theo thứ tự giảm dần. 
Tạo hai lớp QuickSort và MergeSort để cài đặt interface Sortable với phương thức sort() của riêng chúng. 
Gọi đối tượng interface trong hàm main() để kiểm tra.
 */
package javatuanTET;

import java.util.Arrays;

interface Sortable{
    //Không có public thì sort() của Sortable không implement với sort() của QuickSort & MergeSort
    public void sort(int[] array, int a, int b);
}

class QuickSort implements Sortable{
    //Phương thức đỗi giá trị 2 phần tử trong mảng 
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    
    @Override
    public void sort(int[] a, int low, int high){
            if (low < high) {
            int pivot = partition(a, low, high);
            sort(a, low, pivot - 1);
            sort(a, pivot + 1, high);
        }
    }
}

class MergeSort implements Sortable{
    public static void merge(int[] left, int[] right, int[] arr) {
        int leftLen = left.length;
        int rightLen = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLen) {
            arr[k++] = left[i++];
        }
        
        while (j < rightLen) {
            arr[k++] = right[j++];
        }
    }
    
   public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }
   
    @Override
    public void sort(int[] arr, int b, int c){
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }
}

public class bai_16 {
    public static void main(String[] args){
        int[] age = {24, 23, 18, 19, 20};
        QuickSort a=new QuickSort();
        a.sort(age,0,age.length-1);
        for(int x:age){
            System.out.print(x+" ");
        }
    }
}

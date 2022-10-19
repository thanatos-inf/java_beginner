package homework.HW1;
// Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class task_2 {

    public static void main(String args[])
    {
        int res_arr[] = {18, 2, 3, 9, 7, 10, 12, 5};
        System.out.print("Изначальный массив: ");
        printArray(res_arr);
        
        task_2 ob = new task_2();
        ob.sort(res_arr);

        System.out.print("Отсортированный массив: ");
        printArray(res_arr);
    }

     void maxHeap(int arr[], int n, int i)
    {
        int max = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[max])
            max = l;

        if (r < n && arr[r] > arr[max])
            max = r;

        if (max != i)
        {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
            maxHeap(arr, n, max);
        }
    }

    public void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeap(arr, n, i);

        for (int i = n - 1; i >= 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        System.out.print("[ ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.print("]");
        System.out.println();
    }
}

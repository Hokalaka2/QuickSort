import java.util.Arrays;

public class Main {
    public static int[] a = {6,4,2,1,5,7,34,23,12,54, 999};

    public static void main(String args[]){
        quickSort(0, a.length-1);
        System.out.print(Arrays.toString(a));
    }

    public static void quickSort(int l, int h){
        int j = 0;
        if(l < h){
            j = partition(l, h);
            quickSort(l, j);
            quickSort(j+1, h);
        }
    }
    public static int partition(int l, int h){
        int pivot = a[l];
        int i;
        int j;
        i = l; j=h;
        while(i < j){
            do{
                i++;
            }while(a[i] <= pivot);
            do{
                j--;
            }while(a[j] > pivot);
            if(i < j){
                swap(i, j);
            }
        }
        swap(l, j);
        return j;
    }

    public static void swap(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

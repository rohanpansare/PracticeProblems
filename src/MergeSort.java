import java.util.Scanner;

/**
 * Created by rohanpansare on 2/6/2017.
 */
public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0 ; i < 8 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j : arr){
            System.out.print (j +" ");
        }
        System.out.println();
        int[] res = mergeSort(arr);
        for(int j : res){
            System.out.print (j +" ");
        }
    }
    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if(n < 2){
            return null;
        }
        int low = 0;
        int high = arr.length;
        int mid = low + (high - low)/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for(int i = 0 ; i < mid ; i++){
            left[i] = arr[i];
        }
        for(int i = 0 ; i < high-mid ; i++){
            right[i] = arr[mid + i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
    return arr;
    }
    public static int[] merge(int[] left , int[] right , int[] arr){
        int nL = left.length;
        int nR = right.length;
        int i=0,j=0,k=0;
        while(i < nL && j < nR){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < nL){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < nR){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
}

import java.util.Arrays;
public class Quick_sort{
    static void quick_sort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
            //it checks is it is already swapped or not
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            //it checks for violation
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quick_sort(arr, low, end);
        quick_sort(arr, start, high);
    }
    public static void main(String[] args) {
        int arr[]=new int[ ]{5,9,3,10,12,100,11};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


}
//5 4 3 2 7
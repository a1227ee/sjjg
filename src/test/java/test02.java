import java.util.Arrays;

public class test02 {
    public static void main(String[] args) {
        int[] arr={1,7,5,3,4,6,9,7,2,3,6,7,2,0,3,5,15,-8,9,3,58,24,15,39,27,36,28,19,3,2,4,12,8,65,4,321,66};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }

            }
            swap(arr,minIndex,i);

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;

    }
}

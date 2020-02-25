import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] i={1,9,8,7,6,5,4,3,2,1};
        bubbleSort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-2;j>=0;j--){
                if(arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                }
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;

    }
}





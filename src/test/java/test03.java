import java.util.Arrays;

public class test03 {

    public static void main(String[] args) {
        int[] arr={1,7,5,3,4,6,9,7,2,3,6,7,2,0,3,5,15,-8,9,3,58,24,15,39,27,36,28,19,3,2,4,12,8,65,4,321,66};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i< arr.length;i++){
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                swp(arr,j,j+1);
            }
        }

    }

    private static void swp(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}

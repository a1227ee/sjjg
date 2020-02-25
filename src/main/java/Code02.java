
import java.util.Arrays;
//选择排序
public class Code02 {

    public static void selectionSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            swp(arr,i,minIndex);
        }
    }

    private static void swp(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args) {
        int[] arr={1,7,5,3,4,6,9,7,2,3,6,7,2,0,3,5,15,-8,9,3,58,24,15,39,27,36,28,19,3,2,4,12,8,65,4,321,66};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

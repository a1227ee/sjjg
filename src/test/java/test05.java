import java.util.Arrays;

public class test05 {
    public static  void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static  void  helan(int target,int[] arr){
        int less=-1;
        int more=arr.length;
        int i=0;

        while (i!=more){
            if (arr[i]>target){
                swap(arr,--more,i);
            }else if (arr[i]<target){
                swap(arr,i++,++less);
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={9,81,4,3,7,1,6,5,3,8,7,5,2,3,6,9,7,4,1,2,3,69,8,7,4,14,2,5,98,9,7,4,255,6,18};
        helan(7,arr);
        System.out.println(Arrays.toString(arr));
    }
}

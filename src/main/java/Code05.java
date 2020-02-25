import java.util.Arrays;

//荷兰问题
public class Code05 {
    public static  void  helan(int target,int[] arr){
        int less=-1;
        int low=arr.length;
        int cur=0;
        while (cur<low){
            if(arr[cur]<target){
                swap(arr,++less,cur++);
            }else  if(arr[cur]>target){
                swap(arr,--low,cur);
            }else {
                cur++;
            }
        }
    }

    public static  void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr={9,81,4,3,7,1,6,5,3,8,7,5,2,3,6,9,7,4,1,2,3,69,8,7,4,14,2,5,98,9,7,4,255,6,18};
        helan(7,arr);
        System.out.println(Arrays.toString(arr));
    }




}

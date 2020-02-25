import java.util.Arrays;

//快速排序
public class Code06 {
    public static void main(String[] args) {
    int[] arr={9,8,7,6,5,4,3,2,1,0};
        quickSork(arr);
        System.out.println(Arrays.toString(arr));
}
    public  static  void quickSork(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        quickSork(arr,0,arr.length-1);
    }
    public  static  void quickSork(int[] arr,int L,int R){
        if(L<R){
            swap(arr,L+(int)(Math.random())*(R-L+1),R);
            int []p=partition(arr,L,R);
            quickSork(arr,L,p[0]-1);
            quickSork(arr,p[1]+1,R);
        }
    }

    private static int[] partition(int[] arr, int L, int R) {
        int less=L-1;
        int more=R;   

        while(L<more){
            if (arr[L]<arr[R]){
                swap(arr,L++,++less);
            }else if(arr[L]>arr[R]){
                swap(arr,L,--more);
            }else {
                L++;
            }
        }
        swap(arr,more ,R);
        return new int[]{less+1,more};
    }
    public static  void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}

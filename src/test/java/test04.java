import java.util.Arrays;

public class test04 {
    public static void main(String[] args) {
        int[] arr={1,7,5,3,4,6,9,7,2,3,6,7,2,0,3,5,15,-8,9,3,58,24,15,39,27,36,28,19,3,2,4,12,8,65,4,321,66};
        mergeSory(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSory(int[] arr) {
        if(arr==null||arr.length<2){
            return ;
        }
        sortProcess(arr,0,arr.length-1);
    }

    private static void sortProcess(int[] arr, int L, int R) {
        if (L==R){
            return ;
        }
        int mid=L+(R-L)/2;
        sortProcess(arr,L,mid);
        sortProcess(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    private static void merge(int[] arr, int L, int mid, int R) {
        int help[]=new int[R-L+1];
        int i=0;
        int p1=L;
        int p2=mid+1;
        while (p1<=mid&&p2<=R){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }

        while (p2<=R){
            help[i++]=arr[p2++];
        }
        while (p1<=mid){
            help[i++]=arr[p1++];
        }
        for (i=0;i<help.length;i++){
            arr[L+i]=help[i];
        }

    }

    private static void swp(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}

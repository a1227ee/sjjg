

public class Code07 {

    public static  void  heapSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }

        for(int i=0;i<arr.length;i++){
            heapInsert(arr,i);
        }
        int heapSize=arr.length;
        swap(arr,0,--heapSize);
        while (heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }
    //大的网上走
    private static void heapInsert(int[] arr, int index) {
        while (arr[index]>arr[(index-1)/2]) {
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;

        }
    }
    //小的的往下走
    private  static  void heapify(int[] arr,int index,int heapSize){
        int left=index*2+1;
        while (left<heapSize){
            int larget=left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
            larget=arr[larget]>arr[index]?larget:index;
            if (larget==index){
                break;
            }
            swap(arr,larget,index);
            index=larget;
            left=index*2+1;

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;

    }
}

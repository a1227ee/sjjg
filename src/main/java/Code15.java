/**
 *  有序矩阵  找数
 */
public class Code15  {

    public static  void sort(int[][] arr,int target){
        int value[][]=new int[1][1];
        int C=arr[0].length-1;
        int R=arr.length;
        int cur=0;
        while (cur<R&&C>=0){
            if (arr[cur][C] < target) {
                C--;
            } else if (arr[cur][C] > target){
                cur++;
            }else if (arr[cur][C] == target){
               value[0][0]=arr[cur][C];
            }else {

            }

        }

    }
}

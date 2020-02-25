import java.util.PriorityQueue;

/**
 *  分黄金10，20，30
 */
public class Code30 {
        public static int lessMoney(int[] arr){
            PriorityQueue<Integer> pQ=new PriorityQueue<Integer>();
            for (int i=0;i<arr.length;i++){
                pQ.add(arr[i]);
            }
            int sum=0;
            int cur=0;
            while (pQ.size()>1){
                cur=pQ.poll()+pQ.poll();
                sum+=cur;
                pQ.add(cur);
            }
            return sum;
        }
}

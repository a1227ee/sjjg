/**
 * 递归版本的阶乘
 */
public class Code32 {
    public static void main(String[] args) {
        priteSub("abc".toCharArray(),0);
    }
    public static long getFactorial1(int n){
        if (n==1){
            return  1l;
        }
        return (long)n*getFactorial1(n-1);

    }
    /**
     * 汉诺塔问题
     */
    public static void process(int N,String from ,String to,String help){
        if (N==1){
            System.out.println("Move 1 from"+from+"to"+to);
        }else{
            process(N-1,from,help,to);
            System.out.println("Move"+N+"from"+from+"to"+to);
            process(N-1,help,to,from);
        }
    }

    /**
     * 子序列
     */
    public static  void  printAllSub(char[] str,int i,String res){
        if (i==str.length){
            System.out.println(res);
            return ;
        }
        printAllSub(str,i+1,res);
        printAllSub(str,i+1,res+String.valueOf(str[i]));
    }
    /**
     * 全排列
     */
    public static void priteSub(char[] str,int start){
        if (start==str.length){
            System.out.println(String.valueOf(str));
            return  ;
        }
        for (int i=start;i<str.length;i++){
            swp(str,i,start);
            priteSub(str, start+1);
            swp(str,i,start);
        }

    }


    private static void swp(char[] arr, int i, int j) {
        char tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }


}

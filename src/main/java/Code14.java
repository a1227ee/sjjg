/**
 * 之字打印
 */
public class Code14 {
    public static  void printMatrixZigZag(int[][] martix){
        int aR=0;//左行
        int aC=0;//左列
        int bR=0;
        int bC=0;
        int endR=martix.length-1;
        int endC=martix[0].length-1;
        boolean fromUp=false;

        while (aR!=endR+1){
            printLevel(martix,aR,aC,bR,bC,fromUp);
            aR=aC==endC?aR+1:aR;
            aC=aC==endC?aC:aC+1;
            bC=bR==endR?bC+1:bC;
            bR=bR==endR?bR:bR+1;
            fromUp=!fromUp;

        }



    }

    private static void printLevel(int[][] martix, int aR, int aC, int bR, int bC, boolean fromUp) {
        if(fromUp){
            while (aR!=bR+1){
                System.out.println(martix[aR++][aC--]);
            }
        }else{
            while (bR!=aR-1){
                System.out.println(martix[bR--][bC++]);
            }
        }

    }
}

import javax.management.Query;
import java.util.Stack;

public  class Code10 {
    /**
     * 返回栈中最小的数
     */

    public static  class  MyStack{
        private Stack<Integer> stackDate;
        private Stack<Integer> stackMin;

        public MyStack(){
            this.stackDate=new Stack<Integer>();
            this.stackMin=new Stack<Integer>();
        }
        public void push(int newNum){
            if(this.stackMin.isEmpty()){
                this.stackMin.push(newNum);
            }else if(newNum<this.getmin()){
                this.stackMin.push(newNum);
            }else {
                int newMin=this.stackMin.peek();
                this.stackMin.push(newMin);
            }
            this.stackDate.push(newNum);
        }
        public int pop(){

            if(this.stackDate.isEmpty()){
                throw new RuntimeException();
            }
            stackMin.pop();
            return stackDate.pop();
        }

        private Integer getmin() {
            if(this.stackMin.isEmpty()){
                throw new RuntimeException();
            }
            return stackMin.peek();
        }


    }

}

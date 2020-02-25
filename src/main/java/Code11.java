import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code11 {
    /**
     * 完成2个队列变成一个栈
     */
    public static class TwoQueuesStack{
        private Queue<Integer> data;
        private Queue<Integer> help;
        public  TwoQueuesStack(){
            data =new LinkedList<Integer>();
            help =new LinkedList<Integer>();
        }
        public void push(int pushInt){
            data.add(pushInt);
        }

        public int peek(){
            if(data.isEmpty()){
                throw new RuntimeException();
            }
            while (data.size()!=1){
                help.add(data.poll());
            }
            int res=data.poll();
            help.add(res);
            swap();
            return res;
        }
        public int pop(){
            if(data.isEmpty()){
                throw  new RuntimeException();
            }
            while (data.size()>1){
                help.add(data.poll());
            }
            int res=data.poll();
            swap();
            return  res;
        }
        private void swap() {
            Queue<Integer> tmp=help;
            help=data;
            data=tmp;
        }
    }

    public static class TwoStackQueue{
        private  Stack<Integer> stackPush;
        private  Stack<Integer> stackPop;

        public TwoStackQueue(){
            stackPush=new Stack<Integer>();
            stackPop =new Stack<Integer>();
        }
        public  void push(int pushInt){
            stackPush.push(pushInt);
        }
        public int poll(){
            if(stackPop.empty()&&stackPush.empty()){
                throw new RuntimeException("");
            }else if(stackPop.empty()){
                while (!stackPush.empty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }
        public void dao(){
            if(!stackPop.isEmpty()){
                return;
            }
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }

        }
    }





}

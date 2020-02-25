
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Code37
 * @Deacription:
 * @Author zzx
 * @Date 2020/2/17 0:37
 **/

public class Code37 {

    private HashMap<Character, Character> mappings;
    public  boolean isValid(String s) {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');


        Stack<Character> stack = new Stack<Character>();

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (mappings.containsKey(c)){
                if (stack.isEmpty()&&stack.peek()==mappings.get(c)){
                    stack.pop();
                }else {
                    return false;
                }


            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        Code37 code37 = new Code37();
        List<String> strings = code37.generateParenthesis(3);
        for (String s:strings){
            System.out.println(s);
        }

    }

    List<String> list =new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        process(n*2-1,1,"(" );
        return list;
        
    }

    public void  process(int sum,int n,String s ){
        if (n<0||sum<0){
            return ;
        }
        if (sum==0 && n==0){
            list.add(s);
        }
        process(sum-1,n+1,s+"(" );
        process(sum-1,n-1,s+")" );
    }
}

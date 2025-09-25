package JavaCoding.String.PermutationAndParenthesis;

import java.util.Stack;

public class validParenthesis {

    public static void main(String[] args) {
        

        String str1 = "[{()[]}()]";
      
        Stack<Character> stack = new Stack<>();
        for (char ch : str1.toCharArray()){

            if(ch=='(')
            stack.push(')');
            else if(ch=='{')
            stack.push('}');
            else if(ch=='[')
            stack.push(']');

            else if(stack.isEmpty() || stack.pop()!= ch){
                System.out.println("Inavlid parenthesis");;
                System.exit(0);
            }
                   
        }

        if(stack.isEmpty())
        {System.out.println("Valid parenthesis");}
    }
    
}

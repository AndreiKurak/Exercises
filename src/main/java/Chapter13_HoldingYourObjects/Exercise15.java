package Chapter13_HoldingYourObjects;

import java.util.Stack;

/**
 * Exercise 15:   (4) Stacks are often used to evaluate expressions in programming languages.
 *                    Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push
 *                    the following letter onto the stack," and’-’ means "pop the top of the stack and print it":
 *                    "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */

public class Exercise15 {

    public static void main(String[] args){
        String expression = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
        Stack<String> stack = new Stack<String>();

        String[] expression2 = expression.split("");
        for (int i = 0; i<expression2.length; i++){
            if (expression2[i].equals("+")){
                stack.push(expression2[i+1]);
                i++;
            }
            else if (expression2[i].equals("-")){
                System.out.println(stack.pop());
            }
        }
        System.out.println(stack);
    }
}

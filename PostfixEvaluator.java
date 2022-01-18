/*
    Created by Srilokh Karuturi 
    We will be using a stack to evaluate the postfix expression.
    
    Ex. Input: 231*+9-
        Output: -4
    Ex. Input: S = "123+*8-"
        Output: -3
*/

import java.util.*;



class PostfixEvaluator
{
    public static void main(String[] args) {
        System.out.println(Solution.evaluatePostFix("231*+9-"));
        System.out.println(Solution.evaluatePostFix("123+*8-"));

    }
}



class Solution
{
    
    public static int result(int one, int two, char operand)
    {
        switch(operand)
        {
            case '*':
                return one * two;
            case '/':
                return one / two;
            case '+':
                return one + two;
            case '-':
                return one - two;
        }
        return 0;
    }
    
    public static int evaluatePostFix(String S)
    {
        // define stack
        Stack<Integer> stack = new Stack<Integer>();
        // define char
        char workingChar;
        // define valueOne & valueTwo
        int valueOne, valueTwo;
        // define result
        int result;
        
        // str.matches("[0-9]+")
        for (int i=0; i<S.length(); i++) 
        {
            workingChar = S.charAt(i);
            if (Character.isDigit(workingChar))
            {
                stack.push(Character.getNumericValue(workingChar));
            }
            else if (!((Character.isDigit(workingChar))) && (i+1 != S.length()))
            {
                valueTwo = stack.pop();
                valueOne = stack.pop();
                result = result(valueOne, valueTwo,workingChar);
                stack.push(result);
            }
            else if (!((Character.isDigit(workingChar))) && (i+1 == S.length())) 
            {
                valueTwo = stack.pop();
                valueOne = stack.pop();
                return result(valueOne, valueTwo,workingChar);
            }
        }
        return 0;
    }
}
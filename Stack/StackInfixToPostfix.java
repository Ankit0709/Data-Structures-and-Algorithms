package Stack;

import java.util.Stack;

public class StackInfixToPostfix
{
	static int precednce(char ch)
	{
		switch(ch)
		{
		 case '+':
		 case '-':return 1;
		 case '*':
		 case '/':return 2;
		 case '^':return 3;
		 
			
		}
		return -1;
	}
	
	static String infixToPostfix(String exp)
	{
		//an empty string for result
		String result="";
		
		//a stack for initilisation
		Stack<Character> s1=new Stack();
		
		for(int i=0;i<exp.length();i++)
		{  char c=exp.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result+=c;
			}
			else if(c=='(')
 			{s1.push(c);
				
			}
			else if(c==')')
			{
				while(!s1.isEmpty()&&s1.peek()!='(')
					result+=s1.pop();
				if(!s1.isEmpty()&&s1.peek()!='(')
					System.out.println("Invalid Expression");
				else
					s1.pop();
			}
			else
			{
				while(!s1.isEmpty()&& precednce(c)<=precednce(s1.peek()))
					result+=s1.pop();
				s1.push(c);
			}
			
		}
		while(!s1.isEmpty())
			result+=s1.pop();
		
		return result;
		
	}
	public static void main(String[] args) 
	{
		String exp="a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(exp));
	}

}

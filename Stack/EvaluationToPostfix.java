package Stack;

import java.util.Stack;

public class EvaluationToPostfix
{
	static int result(String exp)
	{ Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<exp.length();i++)
		{ 
			char c=exp.charAt(i);
		
		   if(c==' ')
			   continue;
		   
		   else if(Character.isDigit(c))
			{
				int n=0;
				while(Character.isDigit(c))
				{
					n=n*10+(int) (c-'0');
					i++;
					c=exp.charAt(i);
				}
				i--;
				s1.push(n);
				
			}
			else
			{int val1=s1.pop();
			int val2=s1.pop();
				switch(c)
				{
				
				case '+':s1.push(val2+val1);break;
				case '-':s1.push(val2-val1);break;
				case '*':s1.push(val2*val1);break;
				case '/':s1.push(val2/val1);break;
				case '^':s1.push(val2^val1);break;
				
				}
			}
			
		}
		return s1.pop();
	}
	public static void main(String[] args) 
	{
		String exp="100 200 + 2 / 5 * 7 +";
		System.out.println("Postfix Evaluation: "+result(exp));
	}

}

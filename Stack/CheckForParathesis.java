package Stack;

import java.util.Stack;

public class CheckForParathesis {
	static boolean checkForParanthesis(String exp)
	{  Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			switch(c)
			{
			  case '(':
			  case '{':
			  case '[':s1.add(c);break;
			  case '}':
			  {  if(!s1.isEmpty())
				  {if(s1.pop()!='{')
					  return false;
				  }
			  else
				  return false;
			  }
			  break;

			  case ')':
		    {  if(!s1.isEmpty())
				    { if(s1.pop()!='(')
					  return false;
					}
				  else
					  return false;
					  
					  
			  }
			  break;

			  case ']':
			  {
				  if(!s1.isEmpty())
				  {
					  if(s1.pop()!='[')
						  return false;
					  
				  }
				  else
					  return false;
				  
			  }
			  break;
				
			}
			
		}
		if(!s1.isEmpty())
			return false;
		return true;
		
		
	}
	public static void main(String[] args) 
	{
		if(checkForParanthesis("{}{[()()]()}"))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
		
	}
}

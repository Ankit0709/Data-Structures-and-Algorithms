package Stack;

import java.util.Stack;

public class ReverseAString 
{
	static String reverse(String str)
	{   String rev="";
		Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			s1.push(c);
		}
		while(!s1.isEmpty())
		{
			rev+=s1.pop();
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="Geeta Mana";
		System.out.println(reverse(str));
	}

}

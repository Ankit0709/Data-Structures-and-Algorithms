package Stack;

import java.util.Stack;
public class ReverseAStackRecursion
{  static Stack<Character> st = new Stack<>(); 

	static void reverse()
	{
		if(!st.isEmpty())
		{
			char x=st.pop();
			reverse();
			insertAtBottom(x);
		}
	}
	public static void insertAtBottom(char a)
	{
      if(st.isEmpty())
    	  st.push(a);
      else
      {
    	  char x=st.peek();
    	  st.pop();
    	  insertAtBottom(a);
    	  st.push(x);
      }
		
	}
	public static void main(String[] args) 
	{
		  // the stack 
        st.push('1'); 
        st.push('2'); 
        st.push('3'); 
        st.push('4'); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(st); 
          
        
        reverse(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(st); 
	}

}

/*package whatever //do not write package name here */

import java.util.*;

class Trie
{
    static class Node
    {
        char data;
        HashMap<Character,Node> map=new HashMap<>();
        boolean isTerminal;
        Node(char ch)
        {
            data=ch;
        }
    }
    Node root;
    Trie()
    {
        root=new Node('0');
    }
    void insert(String word)
    {
        int n=word.length();
        Node temp=root;
        for(int i=0;i<n;i++)
        {
            if(!temp.map.containsKey(word.charAt(i)))
            {
                Node child=new Node(word.charAt(i));
                temp.map.put(word.charAt(i),child);
                temp=child;
            }
            else
            {
                temp=temp.map.get(word.charAt(i));
                
            }
            
        }
        temp.isTerminal=true;
    }
    boolean search(String word)
    {
        Node temp=root;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            if(temp.map.containsKey(word.charAt(i)))
            {
                temp=temp.map.get(word.charAt(i));
            }
            else
            return false;
        }
        return temp.isTerminal;
    }
}
class TrieImplementation {
	public static void main (String[] args) {
		String[] arr={"apple","mango","ape","not","no","news","code"};
		Trie t=new Trie();
		int x=arr.length;
		for(int i=0;i<x;i++)
	    {	t.insert(arr[i]);
	    }
	    System.out.println(t.search("not"));
	}
}
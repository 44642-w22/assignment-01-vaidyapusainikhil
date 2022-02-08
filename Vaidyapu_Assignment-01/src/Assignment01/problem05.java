package Assignment01;

import java.util.Scanner;
import java.util.Stack;

public class problem05 {
	
	public static void main(String args[]) 
	{
		String string1 = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter expression:");
		string1=scan.nextLine();
		
		System.out.println("Output: " +prob5(string1));
		
		
		
	}
	
	public static boolean prob5 (String r) {
		
		 if ((r.length() % 2) == 1) return false;
		  else {
		    Stack<Character> t = new Stack<>();
		    for (char z : r.toCharArray())
		      switch (z) {
		        case '{': t.push('}'); break;
		        case '(': t.push(')'); break;
		        case '[': t.push(']'); break;
		        default :
		          if (t.isEmpty() || z != t.peek()) { return false;}
		          t.pop();
		      }
		    return t.isEmpty();
		  }
		}

}

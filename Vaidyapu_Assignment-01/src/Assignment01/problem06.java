package Assignment01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class problem06 {
	
public static void main(String args[]) 
	
	{
		Stack<Integer> a = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of integers");
		int size = scan.nextInt();
	
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element at index "+i);
			a.add(i, scan.nextInt());
			
		}
		System.out.println("Output(A): " +prob6(a));
		
		
	}
	
	
	public static ArrayList<Integer> prob6(Stack<Integer> a)
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		int size= a.size();
		 
		 		
	for (int i=a.size()-1;i>=a.size()/2;i--) {
			
			 b.add(a.get(i));
		} 
		for (int i=0;i<a.size()/2;i++) {
		
			b.add(a.get(i));			
		
		}
		 		
		
		return b;
	}
	

}



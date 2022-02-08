package Assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem08 {
public static void main(String[] args) {
		
		Queue<Integer> a = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter no of integers");
		int size = scan.nextInt();
		
		for (int i=0; i<size;i++)
		{
			System.out.println("Enter the number");
			a.add(scan.nextInt());
		}
		
		System.out.println("Output(A): " +prob8(a));
		
	}

	public static ArrayList<Integer> prob8 (Queue<Integer> a)
	
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int s = a.size();
		int a1[] = new int[s];	
		for(int l=0;l<s;l++)
		{
			a1[l]=a.poll();
		}

		if(s%2==0)
		{
		
		for (int i=0,j=s/2+1;i<s/2;i++,j--)
		{
			
			if (j<=s/2-1) 
				break;
			
				
			    b.add(a1[j]);	
				b.add(a1[i]);			
			
			
		}	
		}
		
		else 
		{
			for (int i=0,j=s/2+1;i<s/2;i++,j--)
			{
				
				if (j<=s/2-1) 
					break;
				
					
				    b.add(a1[j]);	
					b.add(a1[i]);			
				
				
			}
			b.add(a1[s/2]);
			
		}
		
		
		
		return b;
		
	}
}
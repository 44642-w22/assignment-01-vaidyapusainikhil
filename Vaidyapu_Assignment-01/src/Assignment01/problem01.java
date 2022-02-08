package Assignment01;

import java.util.LinkedList;
import java.util.Scanner;

public class problem01 {

public static void main(String[] args) {
		
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter no of elements in Linked list:");
		int size = scan.nextInt();
		 for(int i=0; i<size; i++)
		 {
			 System.out.println("Enter the element:");
			 list1.add(i, scan.nextInt());
		 }
		
		 System.out.println("Output(L2): " +prob1(list1));
		
		
				
	}
		
		
	
	public static LinkedList<Integer> prob1(LinkedList<Integer> list1) {
		
		LinkedList<Integer> list2 = new LinkedList<>();
		
		for (Integer num : list1) {
			
			
			
			int i,sum=0;
			
			for (i=1;i<=num/2;i++) {
				if(num%i==0)
				{
					sum=sum+i;
				}
			}
			
			if(sum==num)
			{
				list2.add(num);
			}
			
		
			
			}
		return list2;
			
			
		}
}

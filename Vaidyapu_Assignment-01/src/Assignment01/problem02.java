package Assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class problem02 {
	
public static void main(String args[]) {
		
		Scanner scan= new Scanner(System.in);
		
		LinkedList<Integer> p = new LinkedList<>();
		System.out.println("Enter k");
		int k= scan.nextInt();
		System.out.println("Enter no of input elements");
		int size=scan.nextInt();
		for (int i=0;i<size;i++) {
			System.out.println("Enter element");
			p.add(scan.nextInt());
		}	
		System.out.println("Output (L2) : " +prob2(p,k));
		
	} 
	
public static LinkedList<ArrayList> prob2(LinkedList<Integer> p, int k){
		
		LinkedList<ArrayList> outputList = new LinkedList<>();
		
		
		for (int i=0;i<p.size()-1;i++) {
			ArrayList<Integer> q = new ArrayList<>();
			
				
				
				int a = p.get(i);
				int b = p.get(i+1);
				if((a+b)==k)
				{
					q.add(a);
					q.add(b);
				}
				
			
			if(q.size()!=0) {
				outputList.add(q);
			}

		}
					
		return outputList;
		
	} 
}
package Assignment01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem03 {
	
public static void main(String args[]) {
		
		ArrayList<Integer> p = new ArrayList<>();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter numbers");
		int size=scan.nextInt(); 
		
	
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter number");
			p.add(scan.nextInt());
		}
		
		System.out.println("Output: " +prob3(p));
		
	} 
	
	
	
	public static Integer prob3(ArrayList<Integer> p)
	{
		int a;
		
		if(p.size()!=0) {
			Collections.sort(p);
			a= p.get(p.size()-1);
			
		}
		
		else {
			a=Integer.MIN_VALUE;
			
		}
		
		return a;		
		
	}


}

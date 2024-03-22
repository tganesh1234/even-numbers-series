package gani.assignments;

import java.util.Scanner;

public class Evennumbersprinting {

	public static void main(String[] args) {
		// print even numbers in between the given range
		int x,y;
		System.out.print("enter the two numbers :");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		for (int i=x+1;i<y;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}

/* 2.	Write a Java class called CountDigits. 
 * This class defines a method called countDigits() 
 * which takes as its only parameter an int called n, 
 * and returns an int representing the number of digits in n. 
 * You MAY assume that n is a positive integer
 * */

package com.test02.bll;
import java.util.Scanner;
public class CountDigits {
	
	public static void main(String[] args) {
  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		System.out.println("Number of digits :"+countDigits(n));
		sc.close();
	}
     static int countDigits(int n)//Static code execute first
	{   
		int  count=0;
		while(n>0) {
			
			n=n/10;
			count++;
		}
		 return count;
	 }
}

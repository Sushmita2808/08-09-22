/* 1.	You have to design the code such that the user has only three tries 
 *    to guess the correct pin of the account. You set the pin as a constant 
 *    with a final attribute. When correct display “Correct, welcome back.” 
 *       When incorrect display “Incorrect, try again.”.
 *      When ran out of tries display “Sorry but you have been locked out.”*/
package com.test02.bll;
import java.util.Scanner;
public class AccountPin {
	public static final int PIN= 7777;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int tries=0;//we have to take variable tries
		while(true) {
			System.out.println("Enter your Pin number :");//get pin from the user
			int pin = sc.nextInt();
			
			if(pin==PIN) {//if pin is equal to given pin
				System.out.println("Correct, welcome back. ");//true
				break;
			}
			else {
				
			if(tries<2) {
			System.out.println("Incorrect, try again. ");//false
			}
		}
			tries++;//you can  attempt only 3 tries.
			
			if(tries>=3) {//if 3 tries fail user will got this message
				System.out.println("Sorry but you have been locked out.");
				break;
			}
			 }	
		sc.close();
	}
	
}

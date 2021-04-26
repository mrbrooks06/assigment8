package assigments8;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    plus();

	    }

	    public static void plus() {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("enter first number:");
	        int num1=scan.nextInt();
	                
	        System.out.println("enter second number:");
	        int num2=scan.nextInt();
	        
	        int sum=num1+num2;
	        System.out.println("Result: "+sum);
	        scan.close();
	    }

	}
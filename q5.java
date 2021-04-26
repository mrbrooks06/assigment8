package assigments8;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		   System.out.println("Enter a number");
		   int num=scan.nextInt();
		    int a=    sign(num);
		        System.out.println(a);
		scan.close();
		    }

		    private static int sign(int num) {
		        if (num>0) {
		            return 1;
		        }
		        if (num<0) {
		            return -1;
		        }else {
		            return 0;
		        }
		        
		        
		    }

		    public static void sign() {
		        
		        
		        
		    }

		}
package programsTill17Oct;

import java.util.Scanner;

public class CalculateMaxNumber {
	 int a,b,c;


	    public void maxNumber() {
	        if (a>b && a>c) {
	            System.out.println("a is big Number");
	        }
	        else if (b>a && b>c) {
	            System.out.println("b is big Number");
	        }
	        else {
	            System.out.println("C is big Number");
	        }
	            
	        
	    }
	    
	    
	    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	        
	        int a=in.nextInt();
	        int b=in.nextInt();
	        int c=in.nextInt();
	        in.close();
	        
	        CalculateMaxNumber obj = new CalculateMaxNumber();
	        obj.a=a;
	        obj.b=b;
	        obj.c=c;
	        obj.maxNumber();
	        System.out.println("obj.maxNumber");
	        
	        
	        
	        
	        

	    }

	

}

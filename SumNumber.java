package programsTill17Oct;

import java.util.Scanner;

public class SumNumber {
int N1,N2,N3;
    
    
    int x = (N1+N2+N3);
    
    public void sum() {
        x = N1+N2+N3;
        
            
        
    }

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int N1=in.nextInt();
    int N2=in.nextInt();
    int N3=in.nextInt();
    
    in.close();
    
    SumNumber obj = new SumNumber();
    obj.N1 = N1;
    obj.N2 = N2;
    obj.N3 = N3;
    obj.sum();
    
    
    System.out.println(obj.x);
    
    

    }

}

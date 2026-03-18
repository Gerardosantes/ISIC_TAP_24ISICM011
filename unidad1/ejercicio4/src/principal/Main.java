
package principal;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
     int m=16;
     int a=5;
     int c=3;
     int x=4;
     
     System.out.print("Ingresa el valor de m: ");
         m = sc.nextInt();
        
        System.out.print("Ingresa el valor de a: ");
        a = sc.nextInt();
        
        System.out.print("Ingresa el valor de c: ");
        c = sc.nextInt();
        
        System.out.print("Ingresa el valor inicial x: ");
         x = sc.nextInt();
    
         
         System.out.println("Iteración\tX\tU");
     
        for (int i = 0; i < 5; i++) {
            x=(a*x+c)%m;
            
            double u= (double)x/m;
            
            System.out.println(i+"\t\t"+x+"\t"+u);
        }
        
          sc.close();
    }
    
}

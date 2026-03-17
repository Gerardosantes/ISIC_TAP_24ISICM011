
package principal;


public class Main {
    
    public static void main(String[] args) {
        
        
     int m=16;
     int a=5;
     int c=3;
     int x=4;
     
        for (int i = 0; i < 5; i++) {
            x=(a*x+c)%m;
            
            double u= (double)x/m;
            
            System.out.println(i+"\t\t"+x+"\t"+u);
        }
        
    }
    
}

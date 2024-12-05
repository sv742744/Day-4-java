import java.util.*;
 public class noofdivisor {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int d=s.nextInt();
        for(int i=0;i<d;i++){
        int n=s.nextInt();
        int c=0;
        for(int j=1;j<=n;j++){
                if((n%j)==0){
                    c++;
                }
            }
            System.out.print(" count = "+c); 
        }   
    }
 }
 
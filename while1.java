import java.util.*;
 public class while1{
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int d=s.nextInt();
        while(d>0){
            if((d&1)==0)
                System.out.println("Even");
            else    
                System.out.println("odd");
        break;
        }
        
    }
}
import java.util.*;
 public class  countofdivisor {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                c++;
                if(i*i!=n){
                    c++;
                }
            }
        }
        System.out.println("count="+c);        
    }
}
   
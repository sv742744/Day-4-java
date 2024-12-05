import java.util.*;
 public class mulof8 {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int d=s.nextInt();
        for(int i=0;i<=d;i++){
            int n=s.nextInt();
            if((n&7)==0){
                System.out.printf("%d is multiple of 8                    ",n);
            }
            else{
                System.out.printf("%d is not multiple of 8              ",n);
            }
        }
    }
 }
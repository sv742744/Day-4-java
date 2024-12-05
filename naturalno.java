import java.util.*;
 public class naturalno {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=n-1;
        while(i>=0){
            System.out.println(i);
            i-=1;
        }
    }
 }
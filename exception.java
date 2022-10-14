package manideep;

import java.util.Scanner;

public class p8{
         public static void main(String[] Args){
                Scanner sc= new Scanner(System.in);
                int a,b;
                float c;
                a= sc.nextInt();
                b= sc.nextInt();
                try{
                      c=a/b;
                }
                catch(Exception e){
                       System.out.println("Division is not possible with zero.");
return ;
}
double d=(double) b;
                System.out.println("a/b= "+a/d);
     }
}

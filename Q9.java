import java.util.Scanner;
public class Q9{
    public static void main(String[] args)
    {
        int r=0,rev=0,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
          int n=s.nextInt();
          int a=n;
         while(n>0)
         {
             r=n%10;
             rev=rev*10+r;
            n=n/10;
            c=c+1;
         }
         int rev1=rev;
         System.out.println("The reverse of "+a+" is "+rev1);
         System.out.println("The no of digits is "+c);
}
}
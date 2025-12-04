import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args)
    {
        int c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
          int n=s.nextInt();
         while(n>0)
         {
            n=n/10;
            c=c+1;
         }
         System.out.println("The no of digits is "+c);
}
}
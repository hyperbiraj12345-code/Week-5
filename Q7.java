import java.util.Scanner;

public class Q7{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number a ");
    int a=s.nextInt();
    System.out.println("Enter second number b ");
    int b=s.nextInt();
    System.out.println("Enter +,-,*,/");
    s.nextLine();
    String ch=s.nextLine();
    while(ch.equals("+"))
    {
    System.out.println("a+b= "+(a+b));
    break;
    }
    while(ch.equals("-"))
    {
    System.out.println("a-b= "+(a-b));
    break;
    }
    while(ch.equals("*"))
    {
    System.out.println("a x b= "+(a*b));
    break;
    }
    while(ch.equals("/"))
    {
    System.out.println("The quotient is  "+(a/b));
    System.out.println("The remainder is "+(a%b));
    break;
    }
    }
}

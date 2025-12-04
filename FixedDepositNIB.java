import java.util.Scanner;

public class FixedDepositNIB{
    public static void main(String[] args)
    {
      double CI=0;
      double CA=0;
    System.out.println("Enter the Principal, Rate and Time"); 
    System.out.println("Principal > 1000 ,Rate in between 8 and 12 ,Time < 5 years");
    Scanner s=new Scanner(System.in);
    Float p=s.nextFloat();
    int r=s.nextInt();
    int t=s.nextInt();
    if(p>1000 && r>=8 && r<=12 && t<5)
    {
    CA=p*Math.pow((1+(r/1200.0)),12*t);
    System.out.println("Your maturity amount is "+CA);
    System.out.println("The processing fee rate is 0.5% of "+CA);
    System.out.println("The processing fee amount is "+0.005*CA);
    CI=p-0.005*CA;
    System.out.println("You will receive "+ CI +" as interest monthly");
    }
    else{
        System.out.println("Invalid Input");
        }
       }
}

public class Q5{
    public static void main(String[] args)
    {  
        int i;
        int j;
        for(i=1;i<=5;i++)
        {
        for (int s =1;s<=5-i;s++) {
        System.out.print(" ");
        }
         for(j=1;j<=i;j++)
         {
        System.out.print(j);
         }
         System.out.print("\n");
        }
    }
}
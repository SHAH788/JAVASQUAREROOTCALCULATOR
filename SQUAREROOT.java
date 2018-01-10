import java.util.Scanner;
public class SQUAREROOT
{

    public static void main (String args[])
    {
     
        double integer, S, Root;
        Scanner input = new Scanner(System.in);
        integer = input.nextDouble();
        Root = integer / 4;
        do
        {
            S = Root;
            Root = (S + (integer / S)) / 2;
        }
        while ((S - Root) != 0);
        
         System.out.println("root is!"+(Root));
          
    }
}
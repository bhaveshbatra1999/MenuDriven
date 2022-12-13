import java.util.Scanner;

public class menuDriven
{
        public static void sum(int x,int y)
        {
            int result=x+y;
            System.out.print("Sum is :- "+result);
        }
        
        public static void sub(int x,int y)
        {
            int result=x-y;
            System.out.print("Subtraction is :- "+result);
        }
        
        public static void mult(int x,int y)
        {
            int result=x*y;
            System.out.print("Multiplication is :- "+result);
        }
        
        public static void div(int x,int y)
        {
            int result=x/y;
            System.out.print("Division is :- "+result);
        }
        
        public static void mod(int x,int y)
        {
            int result=x%y;
            System.out.print("Modulas is :- "+result);
        }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number :- ");
        int x = sc.nextInt();

        System.out.println("Enter 2nd Number :- ");
        int y = sc.nextInt();
        
        System.out.println("Press 1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulas");
        int choice = sc.nextInt();
    }
}


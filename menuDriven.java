import java.util.Scanner;

public class menuDriven
{
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


import java.util.Scanner;

class OddOrEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if the number is even or odd");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
            System.out.println("The number is odd");
    }
}
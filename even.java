import java.util.Scanner; //program to find anumber is odd or even//
class even{
public static void main (String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
int num=obj.nextInt();
if (num%2==0)
{
System.out.println("the number is even number");
}
else
{
System.out.println("the number is odd number");
}
}
}

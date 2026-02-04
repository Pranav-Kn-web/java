import java.util.Scanner;//program to find a factorial of number by taking user input//
public class factorialfun {
static  int factorial(int n)
{
int f=1,i;
for(i=2;i<=n;i++)
f=f*i;
return f;
}
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
int num=obj.nextInt();
System.out.println("factorial of " +num+ " is "+factorial(num));
}
}
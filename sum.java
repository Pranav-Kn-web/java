import java.util.Scanner;
class sum{
static int sum(int n,int m)
{       
int sum =m+n;
return sum;
}
public static void main(String[] args){

Scanner obj=new Scanner(System.in);
System.out.println("enter the first number");
int a=obj.nextInt();
System.out.println("enter the second number");
int b=obj.nextInt();
System.out.println("sum of " +a+ " and " +b+ " is " +sum (a,b));
}
}
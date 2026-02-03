public class factorial{
static int factorial(int num){
int f=1,i;
for(i=1;i<=num;i++){
f=f*i;
}
return f;
}
public static void main(String[]args)
{
int num=5;
int ft=factorial(num);
System.out.println(" factorial of " +num+ " is " +ft);
}
}

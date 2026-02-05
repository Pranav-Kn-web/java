import java.util.Scanner;
public class square{
static int square(int n){
return n*n;
}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter a number");

int num=sc.nextInt();
System.out.println(square(num));
}
}


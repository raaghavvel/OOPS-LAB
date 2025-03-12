import java.util.Scanner; 

public class FibonacciSeries{

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a number: ");
int num = scanner.nextInt();
System.out.println("Fibonacci Series for "+num+" terms:");
int a = 0;
int b=1;
System.out.print(a+","+b);
for (int i = 1; i <= num-1; i++) { 
int s=a+b ;
System.out.print(","+s);
a=b;
b=s;
}
}
}



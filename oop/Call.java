import java.util.Scanner; 
public class Largest{
int a,b,c;
void lar(int a,int b, int c){ if(a>b && a>c){
System.out.println(a + "Is the largest among 3");
}
else if(b>a && b>c){
System.out.println(b + "Is the largest among 3");
}
else if(c>a && c>b){
System.out.println(c + "Is the largest among 3");
}
else{
System.out.println("All are equal no larger number");
}
}
}

class Call{
public static void main(String[]args){ 
Largest l1= new Largest(); 
Scanner ip=new Scanner(System.in);
System.out.println("Enter Number 1: "); 
int a=ip.nextInt(); 
System.out.println("Enter Number 2: "); 
int b=ip.nextInt(); 
System.out.println("Enter Number 3: "); 
int c=ip.nextInt();
l1.lar(a,b,c);
}
}




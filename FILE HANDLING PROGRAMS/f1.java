import java.io.FileWriter;
public class f1{
public static void main(String[]args){
try{
FileWriter f1=new FileWriter("new.txt");
f1.write("File Handling Problem");
f1.append("  Completed!!");
f1.close();}
catch(Exception error){
System.out.println("Error is: "+error);
}
}}
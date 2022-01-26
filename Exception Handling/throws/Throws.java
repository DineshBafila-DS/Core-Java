// @Author: Dinesh Bafila
//throws is used to declare Checked Exception
import java.io.*;
class Throws
{
public static void main(String args[])
throws IOException//here we have thrown the checked Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
String a=br.readLine();
System.out.println("Your name is "+a);
}
}
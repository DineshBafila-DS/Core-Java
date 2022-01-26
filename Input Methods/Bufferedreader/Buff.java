//@ Author: Dinesh Bafila
//Here we will take input at run time using BufferedReader class and will implement a two dimensional array
import java.io.*;
class Buff
{
public static void main(String args[])
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int[3][3];
System.out.println("Please Enter array elements");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The array elements are:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
}}
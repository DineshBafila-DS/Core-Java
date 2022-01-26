//@ Author: Dinesh Bafila
//Here we will take input at run time using Scanner class and will implement a two dimensional array
import java.util.Scanner;
class Scan
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
System.out.println("Please Enter array elements");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
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
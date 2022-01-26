// @Author: Dinesh Bafila
//Here we will see multiple catch block(But it must follows the order i.e. most specific to most general)
class Try2
{
public static void main(String args[])
{
try
{
int a=10/0;
System.out.println("This will not execute");
}
catch(ArithmeticException e)
{
System.out.println("This will execute and gives the description of the exception: "+e);
}
catch(Exception e)
{
System.out.println("SuperClass of Exception");
}
finally
{
System.out.println("This will always execute");
}
}
}
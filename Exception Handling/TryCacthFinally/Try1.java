// @Author: Dinesh Bafila
//Here we will see try, catch and finally block
class Try1
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
finally
{
System.out.println("This will always execute");
}
}
}
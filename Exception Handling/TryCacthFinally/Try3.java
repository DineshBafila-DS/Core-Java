// @Author: Dinesh Bafila
//Here we will see try with finally (try must be followed by either catch or finally or both)
class Try3
{
public static void main(String args[])
{
try
{
int a=10/0;
System.out.println("This will not execute");
}
finally
{
System.out.println("This will always execute");
}
}
}
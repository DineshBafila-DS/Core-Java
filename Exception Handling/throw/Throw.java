// @Author: Dinesh Bafila
//throw is used to explicitly throa an exception(mainly custom exceptions)
class Throw
{
static void dis(int age)
{
if(age<18)
{
throw new ArithmeticException("Not valid");
}
else
{
System.out.println("welcome to vote");
}
}
public static void main(String args[])
{
dis(18);
System.out.println("rest of the code...");
}
}
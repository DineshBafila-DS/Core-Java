//@ Author: Dinesh Bafila
class Constructor1
{
Constructor1()// Default Constructor
{
System.out.println("Parernt class Constructor");
}
}
class Constructor2 extends Constructor1
{
Constructor2()// Parameterized Constructor
{
System.out.println("child class Constructor");
}
public static void main(String args[])
{
Constructor2 c=new Constructor2();//it will call default constructor
}
}


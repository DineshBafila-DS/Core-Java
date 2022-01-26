//@ Author: Dinesh Bafila
class Constructor
{
Constructor()// Default Constructor
{
System.out.println("Default Constructor");
}
Constructor(int a)// Parameterized Constructor
{
System.out.println("Parameterized Constructor");
}
public static void main(String args[])
{
Constructor c=new Constructor();//it will call default constructor
Constructor c1=new Constructor(10); //it will call paremeterized constructor
}
}


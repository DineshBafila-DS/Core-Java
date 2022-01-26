// Author: Dinesh Bafila
//If Constructor are parameterized, then it refers to super class constructor
class B
{
B(int a)
{
System.out.println("This is super class Constructor");
}
}
class Super2 extends B
{
Super2()
{
super(10);// This will call super class constructor otherwise it will give an error
System.out.println("This is chaild class constructor");
}
public static void main(String args[])
{
Super2 s=new Super2();
}
} 


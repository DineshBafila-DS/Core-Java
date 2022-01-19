// @ Author: Dinesh Bafila
abstract class A
{
void dis() // This is Concrete Method
{
System.out.println("This is Concrete Method");
}
abstract void abs1(); //Abstract Method
abstract void abs2(); // Abstract Method
}
class Abstract extends A
{
void abs1()
{
System.out.println("Abstract method 1 ");
}
void abs2()
{
System.out.println("abstract method 2");
}
public static void main(String args[])
{
Abstract b=new Abstract();
b.dis();
b.abs1();
b.abs2();
}
}

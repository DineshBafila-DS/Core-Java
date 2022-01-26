//@ Author Name: Dinesh Bafila
//Abstract class in java
abstract class A1
{
void show()
{
System.out.println("Concrete Method");
}
abstract void display();
abstract void display1();
}
class Abstract1 extends A1
{
void display()
{
System.out.println("Implementation of Abstract Method1");
}
void display1()
{
System.out.println("Implementation of Abstract Method2");
}
public static void main(String args[])
{
Abstract1 a=new Abstract1();
a.display();
a.display1();
}
}
// Author: Dinesh Bafila
//It prevents method overriding
class C
{
void show()
{
System.out.println("This is super class method");
}
}
class Super3 extends C
{
void show()
{
super.show();
System.out.println("This is child class method");
}
public static void main(String args[])
{
Super3 s=new Super3();
s.show();
}
} 


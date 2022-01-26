//@Author : Dinesh Bafila
//if a method is static, then if we want to access it from other class, then we can call it simply by using class name
class S
{
static void show()
{
System.out.println("static method");
}
void display()
{
System.out.println("Non static method");
}
}
class Static2 
{
public static void main(String args[])
{
S s=new S();
S.show();//directly call
s.display();
}
}
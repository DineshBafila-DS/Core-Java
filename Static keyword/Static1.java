//@Author : Dinesh Bafila
//if a method is static, then we can call it directly in same class 
class Static1
{
static void show()
{
System.out.println("static method");
}
void display()
{
System.out.println("Non static method");
}
public static void main(String args[])
{
Static1 s=new Static1();
show();//directly call
s.display();
}
}
//@ Author : Dinesh Bafila
class Method
{
void show()
{
System.out.println("Method 1");
}
void display(int a)
{
System.out.println("Parameterized Method 2");
}
public static void main(String args[])
{
Method a=new Method();
a.show();
a.display(10);
}
}
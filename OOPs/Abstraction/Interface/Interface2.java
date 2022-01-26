// @Author Name: Dinesh Bafila
//Two interfaces can extend each other
interface A1
{
int a=10;//by default this variable will be final variable
void show(); //by default this method is abstract  //by default this 
}
interface B1 extends A1
{
void display();
}
class Interface2 implements B1
{
public void show()
{
System.out.println("Implementation of method show()");
}
public void display()
{
System.out.println("Implementation of method display()");
}
public static void main(String args[])
{
Interface2 i=new Interface2();
i.show();
i.display();
}
}

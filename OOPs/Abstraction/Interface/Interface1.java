// @Author Name: Dinesh Bafila
interface A
{
int a=10;//by default this variable will be final variable
void show(); //by default this method is abstract 
void display(); //by default this method is abstract
}
class Interface1 implements A
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
Interface1 i=new Interface1();
i.show();
i.display();
}

}

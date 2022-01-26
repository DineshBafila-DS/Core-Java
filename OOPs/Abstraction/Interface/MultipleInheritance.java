// @Author Name: Dinesh Bafila
//We can Achieve Multiple Inheritance using interface in java
interface A2
{
void show(); 
}
interface B2 
{
void display();
}
class MultipleInheritance implements A2,B2
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
MultipleInheritance  i=new MultipleInheritance();
i.show();
i.display();
}
}

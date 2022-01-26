//@ Author: Dinesh Bafila
//Inheritance is performed using extends keyword in java (Note: Java Doesnt support Multiple Inheritance)
class I
{
void show()
{
System.out.println("Method show with no parameter");
}
}
class Inheritance extends I
{ 
public static void main(String args[])
{
Inheritance i=new Inheritance();
i.show();
}
}

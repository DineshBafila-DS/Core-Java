//@ Author: Dinesh Bafila
//There are two type of polymorphism in java: 1 Method Overloading(Compile Time Polymorphism) and Method overriding (RunTime Polymorphism)
class MethodOverriding1
{
void show()
{
System.out.println("Super class method show()");
}
}
class MethodOverriding extends MethodOverriding1
{
void show()
{
System.out.println("This will override super class method show()");
}
public static void main(String args[])
{
MethodOverriding m=new MethodOverriding();
m.show();
m.show();
}
}

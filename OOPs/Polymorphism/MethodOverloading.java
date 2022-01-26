//@ Author: Dinesh Bafila
//There are two type of polymorphism in java: 1 Method Overloading(Compile Time Polymorphism) and Method overriding (RunTime Polymorphism)
class MethodOverloading
{
void show()
{
System.out.println("Method show with no parameter");
}
void show(int a)
{
System.out.println("Same method but diffrent parameter");
}
public static void main(String args[])
{
MethodOverloading m=new MethodOverloading();
m.show();
m.show(10);
}
}

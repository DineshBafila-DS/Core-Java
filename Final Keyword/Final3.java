//@ Author Name: Dinesh Bafila
//If a method is final, then it can not be override
class f2
{
final void show()
{
System.out.println("Parent class");
}
}
class Final3 extends f2
{
void show()//gives an error
{
System.out.println("Child class");
}
public static void main(String args[])
{
Final3 g1=new Final3();
g1.show();
}
}

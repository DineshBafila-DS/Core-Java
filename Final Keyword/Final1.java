//@ Author Name: Dinesh Bafila
//If a class is final, then it can not be inherited 
final class f
{
void show()
{
System.out.println("Super class method");
}
}
class Final1 extends f// gives compile time error
{
public static void main(String args[])
{
Final1 f1=new Final1();
f1.show();
}
}

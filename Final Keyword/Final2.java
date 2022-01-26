//@ Author Name: Dinesh Bafila
//If a class a variable is final, then we can not change its value 
class f1
{
final int a=10;
}
class Final2 extends f1
{
void show()
{
a=11;// Give an error
System.out.println(a);
}
public static void main(String args[])
{
Final2 g=new Final2();
g.show();
}
}

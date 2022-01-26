//@ Author Name: Dinesh Bafila
//this is first staement and used to call constructor
class This2
{
This2()
{
this(10);
System.out.println("Hello");
//this(10); //Gives an error as this is first statement
}
This2(int a)
{
System.out.println("Python");
}
public static void main(String args[])
{
This2 t1=new This2();
}
}

//@Author: Dinesh Bafila
//finalize() method only call when the unreferenced object encounter.It is used for cleanup processing.
class Finalize
{
public void finalize()
{
System.out.println("Finalize method");
}
public static void main(String args[])
{
Finalize f=new Finalize();
f=null;//unreferenced object
System.gc();
}
}
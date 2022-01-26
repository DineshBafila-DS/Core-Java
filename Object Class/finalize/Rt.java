//@Author: Dinesh Bafila
//Runtime class
class Rt
{
public void finalize()
{
System.out.println("Finalize method");
}
public static void main(String args[])
throws Exception
{
Rt r=new Rt();
r=null;
System.out.println("Memory before garbage collection");
Runtime rt=Runtime.getRuntime();
System.out.println(rt.freeMemory());
System.out.println(rt.totalMemory());
//r=null;
System.gc();
System.out.println("Memory after garbage collection");
System.out.println(rt.freeMemory());
System.out.println(rt.totalMemory());
}
}
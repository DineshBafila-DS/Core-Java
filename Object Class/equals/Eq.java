//@ Author: Dinesh Bafila
//here we will copare equals() with '==' operator, and will also see hashCode() method
class Eq
{
public static void main(String args[])
{
String name="Ramesh";
String s=new String("Ramesh");
System.out.println(name.equals(s));//equals() check content
System.out.println(name==s);//it checks address
System.out.println(s.hashCode());
System.out.println(name.hashCode());
}
}

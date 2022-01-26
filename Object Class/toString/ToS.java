//@ Author: Dinesh Bafila
//here we will override toString() method
class ToS
{
String name;
int id;
void show(String name, int id)
{
this.name=name;
this.id=id;
}
public String toString()//it override tostring() method
{
return name+" "+id;
}
public static void main(String args[])
{
ToS s=new ToS();
s.show("Dinesh",54101);
System.out.println(s);
}
}

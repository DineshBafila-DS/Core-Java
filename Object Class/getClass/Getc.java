//@ Author: Dinesh Bafila
//here we will see getClass() method
class Getc
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
Getc s=new Getc();
s.show("Dinesh",54101);
System.out.println(s);
System.out.println(s.getClass());
}
}

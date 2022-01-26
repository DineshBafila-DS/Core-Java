//@ Author Name: Dinesh Bafila
//this always refers to class variable
class This1
{
String name;
int id;
void show(String name,int id)
{
this.name=name; 
this.id=id;
}
void display()
{
System.out.println("Name is:"+name);
System.out.println("Id is:"+id);
}
public static void main(String args[])
{
This1 t=new This1();
t.show("Dinesh",54101);
t.display();
}
}

//@Author : Dinesh Bafila
//Non static method can access static as well as non static variables and methods, but vice versa is not possible (for that we will have to make the object then call it). 
class Static3
{
static int a=10;
int b=20;
static void show()
{
System.out.println("Accessing static variable in static method"+a);
//System.out.println("Accessing non-static variable in static method"+b);//give an error
Static3 s=new Static3();//by creating object we can access it
System.out.println("Accessing non-static variable in static method"+s.b);
}
void display()
{
//show(); //this is also possible here
System.out.println("Accessing static variable in non-static method"+a);
System.out.println("Accessing non-static variable in non-static method"+b);
}
public static void main(String args[])
{
Static3 s=new Static3();
show();//directly call
s.display();
}
}
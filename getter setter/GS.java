//@Author Name: Dinesh Bafila
//Here we will see getter setter method to access private variable
class GS
{
private int a;
public void setA(int a) //setter()
{
this.a=a;
}
public int getA()//getter()
{
return a;
}
public static void main(String args[])
{
GS g=new GS();
g.setA(10);
System.out.println(g.getA());
}
}
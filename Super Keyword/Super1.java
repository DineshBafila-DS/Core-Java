// @ Author: Dinesh Bafila
//if super keyword always refer to super class variabe
class A
{
int a=10;
}
class Super1 extends A
{
void show()
{
int a=20;
System.out.println("This is child class variable a:"+a);
System.out.println("This is super class variable a:"+super.a);
}
public static void main(String args[])
{
Super1 s=new Super1();
s.show();
}
} 


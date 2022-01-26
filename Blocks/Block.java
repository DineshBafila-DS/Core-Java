//@Author Name: Dinesh Bafila
//There are three types pf block in java:static, Instance initialization and Constructor intialization
class Block
{
static //Fastest block (This block will execute first)
{
System.out.println("Static Block");
}
{//Instance initialization block
System.out.println("Instance initialization Block");
}
Block()//Constructor Block
{
System.out.println("Constructor initialization Block");
}
public static void main(String args[])
{
//System.out.println("Main Block");
Block b=new Block();
System.out.println("Main Block");
}
}
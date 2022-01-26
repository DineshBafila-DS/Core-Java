//@Author: Dinesh Bafila
//MultiThreading
//here, I will demonstrate some methods like setName(), getName(),getId(), currentThread()
class MultiThreading1 extends Thread
{
public void run()
{
System.out.println("Thread is Running");
}
public static void main(String args[])
{
MultiThreading1 t1=new MultiThreading1();
MultiThreading1 t2=new MultiThreading1();
MultiThreading1 t3=new MultiThreading1();
System.out.println(t1.getName()+" and Id is :"+t1.getId());
System.out.println(t2.getName()+" and is is :"+t2.getId());
t1.setName("Dinesh");//Manually set the name
t2.setName("Dinesh1");
System.out.println(t1.getName()+" and Id is :"+t1.getId());
System.out.println(t2.getName()+" and is is :"+t2.getId());
t1.start();
t2.start();	
t3.start();
}
}
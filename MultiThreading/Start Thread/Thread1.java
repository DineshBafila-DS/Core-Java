//@Author: Dinesh Bafila
//MultiThreading
//Starting a thread by extending Thread class
class Thread1 extends Thread
{
public void run()
{
System.out.println("Thread is runnning");
}
public static void main(String args[])
{
Thread1 t=new Thread1();
t.start();	
}
}
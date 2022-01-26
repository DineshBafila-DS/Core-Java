//@Author: Dinesh Bafila
//MultiThreading
//Starting a thread by implementing Runnable Interface
class Thread2 implements Runnable
{
public void run()
{
System.out.println("Thread is runnning");
}
public static void main(String args[])
{
Thread2 t=new Thread2();
Thread t1=new Thread(t);
t1.start();	
}
}
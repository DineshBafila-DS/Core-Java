//@Author: Dinesh Bafila
//MultiThreading
//here, I will demonstrate currentThread() method
class MultiThreading2 extends Thread
{
public void run()
{
System.out.println(Thread.currentThread());
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getId());
}
public static void main(String args[])
{
MultiThreading2 t1=new MultiThreading2();
MultiThreading2 t2=new MultiThreading2();
System.out.println(Thread.currentThread().getName());
t1.start();
t2.start();	
}
}
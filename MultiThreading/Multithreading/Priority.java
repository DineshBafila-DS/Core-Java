//@Author: Dinesh Bafila
//MultiThreading
//here, I will demonstrate priority of threads
class Priority extends Thread
{
public void run()
{
System.out.println("The running thread name is:"+Thread.currentThread().getName());
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
Priority p1=new Priority();
Priority p2=new Priority();
Priority p3=new Priority();
p1.setPriority(Thread.MIN_PRIORITY);
p2.setPriority(Thread.MAX_PRIORITY);
p3.setPriority(Thread.NORM_PRIORITY);
p1.start();
p2.start();
p3.start();	
}
}
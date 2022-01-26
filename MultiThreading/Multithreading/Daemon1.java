//@Author: Dinesh Bafila
//MultiThreading
//here, we illustrate the concept of daemon (service provider thread) and user thread
class Daemon1 extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println("Daemon Thread is Running");
}
else
{
System.out.println("User Thread is Running");
}
}
public static void main(String args[])
{
Daemon1 d1=new Daemon1();
Daemon1 d2=new Daemon1();
Daemon1 d3=new Daemon1();
d1.setDaemon(true);
d1.start();
d2.start();
d3.start();	
}
}
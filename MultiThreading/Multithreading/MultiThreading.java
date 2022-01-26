//@Author: Dinesh Bafila
//MultiThreading
//here we will demostrate the use of join() method
class MultiThreading extends Thread
{
public void run()
{
for(int i=0;i<100;i++)
{
try
{
Thread.sleep(200);
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
MultiThreading t1=new MultiThreading();
MultiThreading t2=new MultiThreading();
MultiThreading t3=new MultiThreading();
t1.start();
try
{
t1.join();//when t1 completes its execution then only other thread will run simultaneously
}
catch(Exception e)
{
System.out.println(e);
}
t2.start();	
t3.start();
}
}
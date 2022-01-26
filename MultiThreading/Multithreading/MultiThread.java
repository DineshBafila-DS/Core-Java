//@Author: Dinesh Bafila
//MultiThreading
//here we will demostrate the use of join() method
class MultiThread extends Thread
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
MultiThread t1=new MultiThread();
MultiThread t2=new MultiThread();
MultiThread t3=new MultiThread();
t1.start();
t2.start();	
t3.start();
}
}
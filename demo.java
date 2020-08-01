class abc extends Thread
{
	public void run()
	{
			for(int i=0;i<10;i++)
			{
				System.out.println("Series One:"+Thread.currentThread().getPriority());
			}
	}
}
class pqr extends Thread
{
	public void run()
	{
			for(int i=0;i<10;i++)
			{
				System.out.println("Series two:"+Thread.currentThread().getPriority());
			}
	}
}
class xyz extends Thread
{
	public void run()
	{
			for(int i=0;i<10;i++)
			{
				System.out.println("Series Three:"+Thread.currentThread().getPriority());
				
			}
	}	
}
class demo
{
	public static void main(String args[])
	{
		abc a=new abc();
		xyz x=new xyz();
		pqr y=new pqr();

		a.setPriority(Thread.MAX_PRIORITY);
		a.start();
		
		x.setPriority(Thread.MIN_PRIORITY);
		x.start();

		y.setPriority(Thread.NORM_PRIORITY);
		y.start();
	}
}














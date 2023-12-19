public class Time
{
   
	
	
	  Time()
	{
		System.out.println("NO parameters constructor");
	}
	 Time(int num)
	{
		System.out.println(num);
	}
	 Time(float num)
	{
		System.out.println(num);
	}
	 Time(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	 Time(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new  Time();
		new  Time(15);
		new  Time(15.24f);
		new  Time(15,5.12f);
		new  Time(60.45f,20);
	}
}
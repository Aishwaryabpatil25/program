public class Jupiter
{
      
	
	
	 Jupiter()
	{
		System.out.println("NO parameters constructor");
	}
	Jupiter(int num)
	{
		System.out.println(num);
	}
	Jupiter(float num)
	{
		System.out.println(num);
	}
	Jupiter(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	Jupiter(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new Jupiter();
		new Jupiter(10);
		new Jupiter(19.34f);
		new Jupiter(21,3.142f);
		new Jupiter(40.64f,40);
	}
}
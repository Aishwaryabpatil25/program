public class Number
{
     
	
	
	  Number()
	{
		System.out.println("NO parameters constructor");
	}
	 Number(int num)
	{
		System.out.println(num);
	}
	 Number(float num)
	{
		System.out.println(num);
	}
	 Number(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	 Number(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new  Number();
		new  Number(50);
		new  Number(18.14f);
		new  Number(23,7.12f);
		new  Number(30.45f,60);
	}
}
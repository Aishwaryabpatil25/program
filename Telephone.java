public class Telephone
{
     

	  Telephone()
	{
		System.out.println("NO parameters constructor");
	}
	 Telephone(int num)
	{
		System.out.println(num);
	}
	Telephone(float num)
	{
		System.out.println(num);
	}
	 Telephone(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	 Telephone(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new  Telephone();
		new  Telephone(70);
		new  Telephone(28.14f);
		new  Telephone(23,7.12f);
		new  Telephone(10.45f,30);
	}
}
public class LinkedIn{
	
	
	LinkedIn()
	{
		System.out.println("NO parameters constructor");
	}
	LinkedIn(int num)
	{
		System.out.println(num);
	}
	LinkedIn(float num)
	{
		System.out.println(num);
	}
	LinkedIn(int num,float num1)
	{
		
		System.out.println(num+","+num1);
	}
	LinkedIn(float num1,int num)
	{
		System.out.println(num1+","+num);
	}

	
	public static void main(String args[])
	{
		new LinkedIn();
		new LinkedIn(40);
		new LinkedIn(10.34f);
		new LinkedIn(30,3.142f);
		new LinkedIn(55.64f,45);
	}
}
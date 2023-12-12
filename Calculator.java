public class Calculator{

	public static void main(String args[])
	{

		addition(20,10);
		mult(2.0f,1.5f);
		div(1.5,4.0);
		name('A');
		bool(true);
		addition(2456,2345);
		

	}


	static int add(int num1,int num2)
	{
  		int sum=num1+num2;
  		System.out.println("sum of two numbers="+sum);
  		return sum;
	}

	static float mult(float num1, float num2)
	{
		float product=num1*num2;
		System.out.println("Multiplication="+product);
		return product;
	}

	static double div(double num1,double num2)
	{
		double d=num1/num2;
		System.out.println("Division="+d);
		return d;
	}

	static char  name(char char1)
	{
		char n=char1;
		System.out.println("Character="+n);
		return n;
	}



	static boolean bool(boolean b1)
	{
		boolean b=b1;
		System.out.println(b);
		return b;
	}

	static long addition(long a,long b)
	{
		long add=a+b;
		System.out.println(add);
		return add;
	}


}
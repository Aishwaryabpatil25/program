public class Number1
{
Number1()
{
System.out.println("no parametere constructor");
}


Number1(int num,int total)
{
System.out.println(num);
}
Number1(int total,short num)
{
System.out.println(total);
}
Number1(short num,int total)
{
System.out.println(num);
}


public static void main(String[]args)
{
short value = 3434;
new Number1();

new Number1(1234,5678);
new Number1(4562,value);
new Number1(value,1211);

}
}
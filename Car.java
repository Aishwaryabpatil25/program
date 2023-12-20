public class Car{
    String brandName;
    String colour;
    int mileage;
    int engineCapacity;
    int noOfAirbags;
    int topSpeed;
    boolean havingAc;


Car(String brandName,String colour, int mileage, int engineCapacity, int noOfAirbags, int topSpeed,boolean havingAc)
{
    this.brandName=brandName;
    this.colour=colour;
    this.mileage=mileage;
    this.engineCapacity=engineCapacity;
    this.noOfAirbags=noOfAirbags;
    this.topSpeed=topSpeed;
    this.havingAc=havingAc;

}


public static void main(String args[])
{
    Car car1=new  Car("Audi","Blue",17,3,6,250,true);
    System.out.println(car1.brandName);
    System.out.println(car1.colour);
    System.out.println(car1.mileage);
    System.out.println(car1.engineCapacity);
    System.out.println(car1.noOfAirbags);
    System.out.println(car1.topSpeed);
    System.out.println(car1.havingAc);

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

    Car car2=new  Car("Kia","White",18,1,6,167,true);
    System.out.println(car2.brandName);
    System.out.println(car2.colour);
    System.out.println(car2.mileage);
    System.out.println(car2.engineCapacity);
    System.out.println(car2.noOfAirbags);
    System.out.println(car2.topSpeed);
    System.out.println(car2.havingAc);

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

    Car car3=new  Car("Tata","Black",15,2,6,140,true);
    System.out.println(car3.brandName);
    System.out.println(car3.colour);
    System.out.println(car3.mileage);
    System.out.println(car3.engineCapacity);
    System.out.println(car3.noOfAirbags);
    System.out.println(car3.topSpeed);
    System.out.println(car3.havingAc);

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

    Car car4=new  Car("Hyundi","yellow",19,2,6,240,true);
    System.out.println(car4.brandName);
    System.out.println(car4.colour);
    System.out.println(car4.mileage);
    System.out.println(car4.engineCapacity);
    System.out.println(car4.noOfAirbags);
    System.out.println(car4.topSpeed);
    System.out.println(car4.havingAc);

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

    Car car5=new  Car("Ford","White",25,2,6,182,true);
    System.out.println(car5.brandName);
    System.out.println(car5.colour);
    System.out.println(car5.mileage);
    System.out.println(car5.engineCapacity);
    System.out.println(car5.noOfAirbags);
    System.out.println(car5.topSpeed);
    System.out.println(car5.havingAc);

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");




    
}

}

public class ArrayExample{
    public static void main(String args[])
    {
        int intArray[]={100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1,0};
        System.out.println("Integer values");
        System.out.println(intArray[18]);
        for(int i=0;i<20;i++)
        {
           System.out.println(intArray[i]);
        }

        float floatArray[]={1.0f,1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f,1.9f,2.0f,2.1f,2.2f,2.3f,2.4f,2.5f,2.6f,2.7f,2.8f,2.9f,3.0f};
        System.out.println("Float values");
        System.out.println(floatArray[10]);
        for(int i=0;i<20;i++)
        {
            System.out.println(floatArray[i]);
        }

        byte byteArray[]={(byte)20,(byte)90,(byte)30,(byte)40,(byte)80,(byte)22,(byte)13,(byte)16,(byte)10,(byte)23,(byte)5,(byte)19,(byte)24,(byte)16,(byte)1,(byte)14,(byte)25,(byte)21,(byte)56,(byte)100};
        System.out.println("Byte values");
        System.out.println(byteArray[3]);
        for (int i=0;i<20;i++)
        {
            System.out.println(byteArray[i]);
        }

        short shortArray[]={(short)11,(short)12,(short)13,(short)14,(short)15,(short)16,(short)17,(short)18,(short)19,(short)20,(short)21,(short)22,(short)23,(short)24,(short)25,(short)26,(short)27,(short)28,(short)29,(short)30};
        System.out.println("Short values");
        System.out.println(shortArray[2]);
        for (int i=0;i<20;i++)
        {
            System.out.println(shortArray[i]);
        }

        char charArray[]={'A','B','C','D','E','F','G','H','I','G','K','L','M','N','O','P','Q','R','S','T'};
        System.out.println("Characters");
        System.out.println(charArray[10]);
        for(int i=0;i<20;i++)
        {
            System.out.println(charArray[i]);
        }

        double doubleArray[]={2658218,12563813,621936218,21926491,1707017432,18934382,134871892,9328191,98273914,190873,198190,981810,8693023,910909482,1083948,104984021,409802910,394810810,1048104891,932048091,358379582,940459400,48028401,1207910,847010,800149837,871827401,};
        System.out.println("double values");
        System.out.println(doubleArray[2]);
        for (int i=0;i<20;i++)
        {
            System.out.println(doubleArray[i]);
        }

        long longArray[]={72198098,9137103,2140120,9023842,1909802,9587302,95728305,220502958,785738,85258952,987482,939428579,98743929,982349,893587,7366899,9375090,8749387,742392458,979322};
        System.out.println("long values");
        System.out.println(longArray[4]);
        for (int i=0;i<20;i++)
        {
            System.out.println(longArray[i]);
        }
        
        boolean boolArray[]={true,false,true,false,true,false,true,false,true,true,true,false,false,true,false,true,true,true,false,true};
        System.out.println("Boolean values");
        for (int i=0;i<20;i++)
        {
            System.out.println(boolArray[i]);
        }
    


        
    }
}
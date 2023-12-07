public class Computer {
    public static void main(String args[]) {
        int returnedValue = click();
        System.out.println(returnedValue);

        char returnValue = enter();
        System.out.println(returnValue);

        short shortValue = emp();
        System.out.println(shortValue);

        double doubleValue = bank();
        System.out.println(doubleValue);

        long longValue = accNo();
        System.out.println(longValue);

        boolean booleanValue = mouse();
        System.out.println(booleanValue);

        float floatValue = temp();
        System.out.println(floatValue);

        byte byteValue = age();
        System.out.println(byteValue);
    }

    static int click() {
        int value = 20;
        return value;
    }

    static char enter() {
        char value = 'e';
        return value;
    }

    static short emp() {
        short value = 30;
        return value;
    }

    static double bank() {
        double value = 10.0000;
        return value;
    }

    static long accNo() {
        long value = 23415682993L;
        return value;
    }

    static boolean mouse() {
        boolean value = true; 
        return value;
    }

    static float temp() {
        float value = 30.5f;
        return value;
    }

    static byte age() {
        byte value = 23;
        return value;
    }
}

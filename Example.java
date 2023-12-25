public class Example {

    // Default constructor
    public Example() {
        System.out.println("Default constructor: This is the default constructor.");
    }

    // No-parameter constructor
    public ExampleNoParam() {
        System.out.println("No-parameter constructor: This constructor has no parameters.");
    }

    // Constructor with parameters
    public ExampleWithParam(int value1, String value2) {
        System.out.println("Constructor with parameters: Value1 = " + value1 + ", Value2 = " + value2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Example defaultInstance = new Example(); // Calls the default constructor
        ExampleNoParam noParamInstance = new ExampleNoParam(); // Calls the no-parameter constructor
        ExampleWithParam withParamInstance = new ExampleWithParam(42, "Hello"); // Calls the constructor with parameters
    }
}

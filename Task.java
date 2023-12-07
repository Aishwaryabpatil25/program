public class Task{

    public static void main(String[] args) {
        System.out.println("Task completed ");
        run();
        Switch(); 
        pull();
        debug();
        pop();
        execute();
        Switch(); 
        System.out.println("execute code2");
    }

    static void run() {
        System.out.println("Code is running");
    }

    static void pull() {
        System.out.println("pull the code");
    }

    static void debug() {
        System.out.println("debugging program");
    }

    static void pop() {
        System.out.println("pop elements");
    }

    static void execute() {
        System.out.println("Code is execute");
    }

    static void Switch() { 
        System.out.println("switch the code");
    }
}

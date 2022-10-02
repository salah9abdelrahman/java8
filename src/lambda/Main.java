package lambda;

public class Main {
    public static void main(String[] args) {

        wish(() -> System.out.println("Sba7o"));
             /*
        What did that solve ?
        we didn't have to create a class for each Language (EnglishGreeting, ArabicGreeting) in this example
         */
    }

    public static void wish(Greeting greeting) {
        greeting.greet();
    }
}

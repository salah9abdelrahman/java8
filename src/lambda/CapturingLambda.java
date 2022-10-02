package lambda;

import java.util.function.UnaryOperator;

public class CapturingLambda {

    static int x = 0;

    public static void main(String[] args) {
        // effectively final
        int i = 5;


//        i = 7; // Since we have changed the value of i, the below line will not compile.
        UnaryOperator<Integer> operator = (input) -> input * i;


        x = 7;  //The below code will compile because the variable is reassigned, but it is not a local variable.
        UnaryOperator<Integer> operator2 = (input) -> input * x;

        System.out.println(operator2.apply(x));
        System.out.println(operator.apply(i));
    }
}

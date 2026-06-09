package com.java.functionalprogramming.lambda;


/**
 * for lambda expression we need a functional interface which consist only 1 abstract method.
 */
public class LambdaExpressionDemo{

    static void main(String[] args) {

        ArithmeticExpression addition = (a,b) -> a+b;
        System.out.println( addition.operation(12,13) );

        ArithmeticExpression subtraction = (a,b) -> a-b;
        System.out.println( subtraction.operation(12,13) );

        ArithmeticExpression multiplication = (a,b) -> a*b;
        System.out.println( multiplication.operation(12,13) );

        ArithmeticExpression division = (a,b) -> a/b;
        System.out.println( division.operation(12,13) );
    }
}

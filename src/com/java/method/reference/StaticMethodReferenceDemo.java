package com.java.method.reference;

/**
 * A method reference is a shorthand syntax introduced in Java 8 that allows you to refer
 * to a method without executing it. It acts as a more concise and readable alternative
 * to a lambda expression when that lambda does nothing more than call an existing method.
 * You use the double colon operator (::) to separate the class or object name from the method name.
 * type1: Static Method
 * ClassName::staticMethodName(args) -> ClassName.staticMethodName(args)
 */
public class StaticMethodReferenceDemo {

    static void main(String[] args) {
        /*Demo of lamda expression but if we have static method then just use static method reference which point to
        that functional interface that matches your static method and call that method.
        ArithmeticOperation operation = (a, b) -> {
            int sum = a+b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2, 3);*/

        ArithmeticOperation methodReference = StaticMethodReferenceDemo::addOperation;
        methodReference.performOperation(2,3);


    }

    static int addOperation(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}

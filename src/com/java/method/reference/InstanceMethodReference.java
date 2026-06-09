package com.java.method.reference;

/**
 * for non-static methods we 1st need an instance of a Class which have that method
 * like class InstanceMethodReference have non-static method addOperation, subOperation
 * so create instance of class InstanceMethodReference and then using :: operator refer to the nonstatic method
 * classInstance::instanceMethod equivalent to instanceMethodReference::addOperation;
 */
public class InstanceMethodReference {

    static void main(String[] args) {
        ArithmeticOperation operation = (a, b) -> {
            int sum = a+b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(2, 3);

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        ArithmeticOperation methodReference = instanceMethodReference::addOperation;
        methodReference.performOperation(2,3);

        ArithmeticOperation methodReferenceSub = instanceMethodReference::subOperation;
        methodReferenceSub.performOperation(2,3);
    }

    public int addOperation(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public int subOperation(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}

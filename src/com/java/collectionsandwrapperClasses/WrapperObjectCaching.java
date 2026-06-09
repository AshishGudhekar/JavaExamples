package com.java.collectionsandwrapperClasses;

// Caching works only for Number Objects : Integer, Short, Byte, Long (Numeric primitive datatypes)
// Double, Float( Decimal Primitive datatype)

/**
 * Cache to support the object identity semantics of autoboxing for values between
 * -128 and 127 (inclusive) as required by JLS. to improve performance.
 * if we assign value to wrapper class beyond the range it creates other object even the value is same.
 */
public class WrapperObjectCaching {

    static void main(String[] args) {

        int num = 128;
        // here 128 is out of range (-128 - 127) so new object created everytime instead of
        // assign same memory location.

        Integer numObj1 = Integer.valueOf(num);
        Integer numObj2 = Integer.valueOf(num);

        System.out.println(numObj1==numObj2);   // check memory location are same and return true/false.
        System.out.println(numObj1.equals(numObj2)); // cheks content is same and give result true/false.

    }
}

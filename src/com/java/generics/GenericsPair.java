package com.java.generics;

public class GenericsPair <T,U> {

    private T first;
    private U second;

    public GenericsPair(T first,U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond(){
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(U second){
        this.second = second;
    }

}

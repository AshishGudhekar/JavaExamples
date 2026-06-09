package com.java.inputs;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderDemo {

    static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);
        String data = bf.readLine();
        System.out.println(data);
        bf.close();

    }



}

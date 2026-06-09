package com.java.inputs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 *
 */


public class ReadFileUsingBufferReader {

    static void main(String[] args) throws IOException {
        String filePath = "C:/Users/ashis/Downloads/JAVA_FILE_READER_DEMO.txt";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bf = new BufferedReader(fileReader);

        String line;

        while ((line = bf.readLine()) != null ) {
            System.out.println(line);
        }
        bf.close();

    }
}

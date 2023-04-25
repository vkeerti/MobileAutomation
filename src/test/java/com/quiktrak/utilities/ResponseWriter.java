package com.quiktrak.utilities;

import java.io.*;

public class ResponseWriter {
    public static  BufferedWriter writer;
    static {

        try {
            writer = new BufferedWriter(new FileWriter("src/test/resources/TestOutputFiles/apiOutPut.txt"));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void write(String text) throws IOException {
        writer.write(text+"\n");
    }
}

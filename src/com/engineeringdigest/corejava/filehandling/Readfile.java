package com.engineeringdigest.corejava.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readfile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\PC123\\Desktop\\lp.txt");

//        FileWriter writer = new FileWriter(file );
//
//        int a =10, b=20, c;
//        c=a+b;
//
//        // write.write(c);
//        writer.write(Integer.toString(c));
//
//        writer.close();
//
//        System.out.println("Data has been....");


        // File Reading

        FileReader reader = new FileReader(file);

        int i;
        while((i=reader.read()) != -1) {
            System.out.print((char)i);
        }

    }

}

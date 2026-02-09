package com.engineeringdigest.corejava.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createAndWriteFile {

    public static void main(String[] args)  {

        // For file create we use a File class and it's createNewFile() method.
        File file = new File("C:\\Users\\PC123\\Desktop\\lp.txt");

//        if(file.createNewFile()) {
//            System.out.println("File created");
//        } else {
//            System.out.println("Alreday exist");
//        }

        FileWriter write = null;
            try {
                // For write data
    //        FileWriter write = new FileWriter("C:\\Users\\PC123\\Desktop\\lp.txt");

                write = new FileWriter(file, true);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


            try {
                write.write("Good morning.....");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    write.close(); // to save the data
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        System.out.println("Data has been written....");

    }
}

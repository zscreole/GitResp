package com.msb.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Adam
 * @date: 2023/7/10 - 11:26
 * @description: com.msb.file
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\test.txt");

        FileReader fr = new FileReader(f);

        int n = fr.read();

        while(n!=-1){
            System.out.println((char)n);
            n = fr.read();
        }

        fr.close();
    }
}

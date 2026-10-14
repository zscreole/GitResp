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
public class Test04 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\test.txt");

        FileReader fr = new FileReader(f);

        char[] ch = new char[5];
        int len = fr.read(ch);

        while(len!=-1){
            /*for (int i =0;i<len;i++){
                System.out.println(ch[i]);
            }*/
            String str = new String(ch,0,len);
            System.out.print(str);
            len = fr.read(ch);
        }

        fr.close();
    }
}
